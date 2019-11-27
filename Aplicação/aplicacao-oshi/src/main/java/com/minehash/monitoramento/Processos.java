package com.minehash.monitoramento;

import com.minehash.database.ConexaoBanco;
import com.minehash.usuario.Computador;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

/**
 *
 * @author ligimenes
 */
public class Processos {

    Computador comp = new Computador();
    
    List<OSProcess> listaProcessos;
    OSProcess procs;
    Integer pid;
    String nomeProcesso;
    Integer prioridadeProcesso;
    String usuarioProc;
    String estadoProcesso;
    Double cpuPercentual;
    GlobalMemory memoria;
    Integer idComputador;
    Integer fkComputador;

    public void monitorarProcessos() {

        ConexaoBanco conectarBanco = new ConexaoBanco();
        conectarBanco.montarConexao();

        for (int i = 0; i < 10; i++) {

            listaProcessos = Arrays.asList(comp.os.getProcesses(10, OperatingSystem.ProcessSort.CPU));
            procs = listaProcessos.get(i);
            usuarioProc = procs.getUser();
            pid = procs.getProcessID();
            nomeProcesso = procs.getName();
            prioridadeProcesso = procs.getPriority();
            estadoProcesso = procs.getState().name();
            cpuPercentual = procs.calculateCpuPercent();
            

            System.out.println(usuarioProc);
            System.out.println(pid);
            System.out.println(nomeProcesso);
            System.out.println(prioridadeProcesso);
            System.out.println(estadoProcesso);
            System.out.println(cpuPercentual + "%");
            System.out.println("-------------");

            conectarBanco.template().update(
                    "insert into Processo "
                    + "(usuario, nomeProcesso, pid, statusProcesso, prioridadeProcesso, cpuPercentual, fkComputador)"
                    + " values (?,?,?,?,?,?,?)",
                    usuarioProc, nomeProcesso, pid, estadoProcesso, prioridadeProcesso, cpuPercentual, getFkComputador()
            );

        }

    }

    public void inserirProcessosQuery(Integer fkMinerador) {

        String query = String.format("select idComp from Computador where fkMinerador = %d", fkMinerador);
        selectComputador("jdbc:mysql://localhost:3306/minehash2?useTimezone=true&serverTimezone=UTC",
                "root",
                "Leo5767482200", query);

        monitorarProcessos();

    }

    public void selectComputador(String url, String user, String password, String sql) {

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    setIdComputador(resultSet.getInt("idComp"));
                    setFkComputador(resultSet.getInt("idComp"));

                }
            } finally {

                getIdComputador();
                getFkComputador();
                System.out.println("IDCOMP: " + getIdComputador());
                System.out.println("FKCOMP: " + getFkComputador());

                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return;

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

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

    public Integer getIdComputador() {
        return idComputador;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

}
