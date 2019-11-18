/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.dados;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;

/**
 *
 * @author ligimenes
 */
public class Processos extends Computador {

    List<OSProcess> listaProcessos;
    OSProcess procs;
    Integer idProcesso;
    String nomeProcesso;
    Integer prioridadeProcesso;
    String usuario;
    String estadoProcesso;
    String cpuPercentual;
    GlobalMemory memoria;

    public void monitorarProcessos() {

        for (int i = 0; i < 10; i++) {

            procs = listaProcessos.get(i);
            usuario = procs.getUser();
            idProcesso = procs.getProcessID();
            nomeProcesso = procs.getName();
            prioridadeProcesso = procs.getPriority();
            estadoProcesso = procs.getState().name();
            cpuPercentual = String.format("%.2f", procs.calculateCpuPercent());

            System.out.println(usuario);
            System.out.println(idProcesso);
            System.out.println(nomeProcesso);
            System.out.println(prioridadeProcesso);
            System.out.println(estadoProcesso);
            System.out.println(cpuPercentual + "%");
            System.out.println("-------------");

        }

    }

    public static boolean kill(String processo) {
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
