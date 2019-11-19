package com.mycompany.aplicacao.oshi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

public class Processos extends Computador {

    List<OSProcess> listaProcessos;
    OSProcess procs;
    String nomeProcesso;
    Integer idProcesso;
    Integer prioridadeProcesso;
    String usuario;
    String estadoProcesso;
    Double cpuPercentual;
    Double memoriaPercentual;
    GlobalMemory memoria;

    public void capturarProcessos() {

     

        for (int i = 0; i < 10; i++) {

            listaProcessos = Arrays.asList(os.getProcesses(10, OperatingSystem.ProcessSort.CPU));
            procs = listaProcessos.get(i);

            usuario = procs.getUser();
            nomeProcesso = procs.getName();
            idProcesso = procs.getProcessID();
            prioridadeProcesso = procs.getPriority();
            estadoProcesso = procs.getState().name();
            cpuPercentual = Double.valueOf(procs.calculateCpuPercent());

            conectarBanco.montarConexao();
            conectarBanco.template().update(
                    "insert into Processo (usuario, nomeProcesso, pid, statusProcesso, prioridadeProcesso,"
                    + " cpuPercentual) values (?,?,?,?,?,?)",
                    usuario, nomeProcesso, idProcesso, estadoProcesso, prioridadeProcesso, cpuPercentual
            );

        }

    }

    public static boolean matarProcessos(String processo) {

        try {
            String line;
            Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                if (!line.trim().equals("")) {
                    if (line.substring(1, line.indexOf("\"", 1)).equalsIgnoreCase(processo)) {
                        Runtime.getRuntime().exec("taskkill /F /IM " + line.substring(1, line.indexOf("\"", 1)));
                        return true;
                    }
                }
            }
            input.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
        return false;
    }

}
