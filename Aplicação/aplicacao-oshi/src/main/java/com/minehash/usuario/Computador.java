/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.usuario;

//import oshi.hardware.HWDiskStore;
import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Cpu;
import com.profesorfalken.jsensors.model.components.Disk;
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

    String usuario;
    String hostname;
    String fabricante;
    String modelo;
    String processador;
    String ramTotal;
    String sistemaOperacional;
    List<Disk> ds;
    List<Cpu> cpus;
//    List<Gpu> gpus;
//    String gpuNome;
    int discoSize;
    Double disco;    

    public Computador() {

        usuario = os.getProcess(0).getUser();
        hostname = os.getNetworkParams().getHostName();
        fabricante = hal.getComputerSystem().getManufacturer();
        modelo = hal.getComputerSystem().getModel();
        processador = hal.getProcessor().getName();
        ramTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        sistemaOperacional = si.getOperatingSystem().getFamily();
        ds = JSensors.get.components().disks;
        discoSize = ds.get(0).sensors.loads.size();
        cpus = JSensors.get.components().cpus;
        disco = cpus.get(0).sensors.loads.get(discoSize - 1).value;
//        gpus = JSensors.get.components().gpus;
//        gpuNome = gpus.get(0).name.toString();
        
        

    }

    public String getUsuario() {
        return usuario;
    }

    public String getHostname() {
        return hostname;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public String getRamTotal() {
        return ramTotal;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public Double getDisco() {
        return disco;
    }

    public void setDisco(Double disco) {
        this.disco = disco;
    }

//    public String getGpuNome() {
//        return gpuNome;
//    }
//
//    public void setGpuNome(String gpuNome) {
//        this.gpuNome = gpuNome;
//    }
    
    
    
    

}
