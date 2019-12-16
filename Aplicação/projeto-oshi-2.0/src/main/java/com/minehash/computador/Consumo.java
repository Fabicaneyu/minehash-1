/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.computador;

import com.minehash.database.ConexaoBanco;
import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Component;
import com.profesorfalken.jsensors.model.components.Components;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Disk;
import com.profesorfalken.jsensors.model.components.Gpu;
import com.profesorfalken.jsensors.model.sensors.Fan;
import com.profesorfalken.jsensors.model.sensors.Load;
import com.profesorfalken.jsensors.model.sensors.Temperature;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import oshi.util.FormatUtil;

public class Consumo {

    List<Cpu> cpus;
    List<Gpu> gpus;
    List<Disk> disco;

    int cpuSize;
    int gpuSize;
    int discoSize;
    int gpu;
    int cpuLoad;

    Double cpu;
    Double temperaturaCPU;
    Double temperaturaGPU;
    Double consumoDisco;

    String consumoRAM;

    Integer idComputador;
    Integer fkComputador;

    Computador comp = new Computador();

    public void monitorarConsumo() {

        cpus = JSensors.get.components().cpus;
        disco = JSensors.get.components().disks;

        cpuSize = cpus.get(0).sensors.temperatures.size();
        cpuLoad = cpus.get(0).sensors.loads.size();
        discoSize = disco.get(0).sensors.loads.size();

        temperaturaCPU = cpus.get(0).sensors.temperatures.get(cpuSize - 1).value;

        consumoDisco = cpus.get(0).sensors.loads.get(discoSize - 1).value;
        consumoRAM = FormatUtil.formatBytes(comp.hal.getMemory().getAvailable());

        cpu = cpus.get(0).sensors.loads.get(cpuLoad - 1).value;

    }

    public Boolean gpuUsuario() {

        gpus = JSensors.get.components().gpus;

        if (getGpus().size() == 0) {

            System.out.println("COMPUTADOR NÃO POSSUI PLACA DEDICADA");

            return false;

        } else {

            gpu = gpus.get(0).sensors.loads.size();
            System.out.println(gpu);
            gpuSize = gpus.get(0).sensors.temperatures.size();
            temperaturaGPU = cpus.get(0).sensors.temperatures.get(gpuSize - 1).value;

            return true;
        }

    }

    public void inserirDesempenho(Integer fkMinerador) {

        String query = String.format("select id_computador from tb_computador where fk_usuario = %d", fkMinerador);
        consultarIdComputador(query);
        monitorarDesempenho(fkMinerador);

    }

    public void consultarIdComputador(String sql) {

        Connection connect = null;
        Statement statement = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            connect = DriverManager.getConnection("jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                    + "database=bdminehash;"
                    + "user=userminehash@srvminehash;"
                    + "password=#Gfgrupo1;"
                    + "encrypt=true;"
                    + "trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;"
                    + "loginTimeout=30;",
                    "userminehash@srvminehash",
                    "#Gfgrupo1");

            statement = connect.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                System.out.println("Atribuindo valores a ID_COMP e FK_COMP...");

                setIdComputador(resultSet.getInt("id_computador"));
                setFkComputador(resultSet.getInt("id_computador"));

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void monitorarDesempenho(Integer fk) {

        ConexaoBanco conectar = new ConexaoBanco();
        conectar.montarConexao();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        gpuUsuario();

        if (gpuUsuario() == false) {

            conectar.template().update(
                    "INSERT INTO tb_desempenho (fk_computador, nr_cpu, nr_ram, nr_disco, nr_temperatura_cpu, dt_datahora)\n"
                    + "values (?,?,?,?,?,?)", getFkComputador(), getCpu(), getConsumoRAM(), getConsumoDisco(),
                    getTemperaturaCPU(), dtf.format(now));

        } else {
            conectar.template().update(
                    "INSERT INTO tb_desempenho (fk_computador, nr_cpu, nr_ram, nr_disco,"
                    + " nr_gpu, nr_temperatura_cpu, nr_temperatura_gpu)\n"
                    + "values (?,?,?,?,?,?,?)", getFkComputador(), getCpu(), getConsumoRAM(), getConsumoDisco(),
                    getGpu(), getTemperaturaCPU(), getTemperaturaGPU());

        }

    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Double getTemperaturaCPU() {
        return temperaturaCPU;
    }

    public void setTemperaturaCPU(Double temperaturaCPU) {
        this.temperaturaCPU = temperaturaCPU;
    }

    public Double getTemperaturaGPU() {
        return temperaturaGPU;
    }

    public void setTemperaturaGPU(Double temperaturaGPU) {
        this.temperaturaGPU = temperaturaGPU;
    }

    public Double getConsumoDisco() {
        return consumoDisco;
    }

    public void setConsumoDisco(Double consumoDisco) {
        this.consumoDisco = consumoDisco;
    }

    public String getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(String consumoRAM) {
        this.consumoRAM = consumoRAM;
    }

    public Integer getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

    public List<Gpu> getGpus() {
        return gpus;
    }

}
