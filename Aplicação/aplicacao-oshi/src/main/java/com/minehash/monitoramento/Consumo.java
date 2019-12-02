/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.monitoramento;

import com.minehash.database.ConexaoBanco;
import com.minehash.usuario.Computador;
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
import java.util.List;
import oshi.util.FormatUtil;

public class Consumo {

    List<Cpu> cpus;
    List<Gpu> gpus;
    List<Disk> disco;

    int cpuSize;
    int gpuSize;
    int discoSize;

    Double temperaturaCPU;
    Double temperaturaGPU;

    Double consumoDisco;
    String consumoRAM;

    Integer idComputador;
    Integer fkComputador;

    ConexaoBanco conectar = new ConexaoBanco();
    Computador comp = new Computador();

    public Consumo() {

        cpus = JSensors.get.components().cpus;
        disco = JSensors.get.components().disks;

        cpuSize = cpus.get(0).sensors.temperatures.size();
        discoSize = disco.get(0).sensors.loads.size();

        temperaturaCPU = cpus.get(0).sensors.temperatures.get(cpuSize - 1).value;

        consumoDisco = cpus.get(0).sensors.loads.get(discoSize - 1).value;
        consumoRAM = FormatUtil.formatBytes(comp.hal.getMemory().getAvailable());

        //        gpus = JSensors.get.components().gpus;
        //        gpuSize = gpus.get(0).sensors.temperatures.size();
        //        temperaturaGPU = cpus.get(0).sensors.temperatures.get(gpuSize - 1).value;
    }

    public static void main(String[] args) {

        Consumo c = new Consumo();
        System.out.println(c.temperaturaCPU + "C°");
        System.out.println(c.consumoDisco + "%");
        System.out.println(c.consumoRAM);
    }

    public void inserirDesempenhoQuery(Integer fkMinerador) {

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

        monitorarDesempenho();

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

    public void monitorarDesempenho() {

        conectar.montarConexao();

        System.out.println("INSERINDO DADOS...");
        System.out.println("------------------");
        System.out.println("FK: " + getFkComputador());

        conectar.template().update(
                "insert into Desempenho (fkComputador, CPUatual, RAMatual, DISCO, Temperatura) values"
                + "(?,?,?,?,?)", getFkComputador(), getTemperaturaCPU(),
                getConsumoRAM(), getConsumoDisco(), getTemperaturaCPU());

        System.out.println("FIM DE INSERÇÃO");

        return;
        
    }

    public Double getTemperaturaCPU() {
        return temperaturaCPU;
    }

    public Double getTemperaturaGPU() {
        return temperaturaGPU;
    }

    public String getConsumoRAM() {
        return consumoRAM;
    }

    public Double getConsumoDisco() {
        return consumoDisco;
    }

    public Integer getIdComputador() {
        return idComputador;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

}
