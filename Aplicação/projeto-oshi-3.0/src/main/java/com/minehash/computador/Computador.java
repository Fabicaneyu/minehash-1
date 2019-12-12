/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.computador;

import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Gpu;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;

public class Computador {

    public final SystemInfo si = new SystemInfo();
    public final HardwareAbstractionLayer hal = si.getHardware();
    public final OperatingSystem os = si.getOperatingSystem();

    List<Cpu> cpus;
    List<Gpu> gpus;
    HWDiskStore[] ds;

    String usuario;
    String hostname;
    String fabricante;
    String modelo;
    String processador;
    String ramTotal;
    String sistemaOperacional;
    String disco;
    String gpu;
    String cpu;

    public Computador() {

        usuario = os.getProcess(0).getUser();
        hostname = os.getNetworkParams().getHostName();
        fabricante = hal.getComputerSystem().getManufacturer();
        modelo = hal.getComputerSystem().getModel();
        processador = hal.getProcessor().getName();
        ramTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        sistemaOperacional = si.getOperatingSystem().getFamily();
        ds = hal.getDiskStores();
        disco = FormatUtil.formatBytes(ds[0].getSize());

    }

    public Boolean gpuUsuario() {

        gpus = JSensors.get.components().gpus;

        if (getGpus().size() == 0) {

            System.out.println("COMPUTADOR NÃO POSSUI PLACA DEDICADA");
            return false;

        } else {

            gpu = gpus.get(0).name;
            return true;
        }

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(String ramTotal) {
        this.ramTotal = ramTotal;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public List<Gpu> getGpus() {
        return gpus;
    }
    
    
    

}
