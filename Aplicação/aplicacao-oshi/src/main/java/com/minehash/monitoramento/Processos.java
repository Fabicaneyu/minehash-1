package com.minehash.monitoramento;

import com.minehash.database.ConexaoBanco;
import com.minehash.usuario.Computador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    ConexaoBanco conectarBanco = new ConexaoBanco();
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

    public Processos() {

        listaProcessos = Arrays.asList(comp.os.getProcesses(21, OperatingSystem.ProcessSort.CPU));
    }

    public void monitorarProcessos() {

        conectarBanco.montarConexao();

        for (int i = 0; i < 21; i++) {

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

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            conectarBanco.template().update(
                    "insert into tb_processo (fk_computador, nr_pid, nm_processo, dt_datahora, "
                    + "nm_status, nm_prioridade, nr_consumo_cpu, nm_usuario) values "
                    + "(?,?,?,?,?,?,?,?)",
                    getFkComputador(), pid, nomeProcesso, dtf.format(now), estadoProcesso, prioridadeProcesso,
                    cpuPercentual, usuarioProc
            );

        }

    }

    public void inserirProcessosQuery(Integer fkMinerador) {

        String query = String.format("select id_computador from tb_computador where fk_usuario = %d", fkMinerador);

        selectComputador("jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                + "database=bdminehash;"
                + "user=userminehash@srvminehash;"
                + "password=#Gfgrupo1;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;",
                "userminehash@srvminehash",
                "#Gfgrupo1", query);

        monitorarProcessos();

    }

    public void selectComputador(String url, String user, String password, String sql) {

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    setIdComputador(resultSet.getInt("id_computador"));
                    setFkComputador(resultSet.getInt("id_computador"));

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

    public static boolean matarProcesso(String processo) {
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

    public void enviarProcessosSwing(int id[], String nome[], int prio[]) {

        conectarBanco.montarConexao();

        for (int i = 0; i < 21; i++) {

            procs = listaProcessos.get(i);
            id[i] = procs.getProcessID();
            nome[i] = procs.getName();
            prio[i] = procs.getPriority();

        }

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
