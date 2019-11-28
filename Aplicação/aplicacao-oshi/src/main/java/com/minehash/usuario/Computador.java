/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.usuario;

import oshi.hardware.HWDiskStore;
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
    String disco;
    HWDiskStore ds;
//    GlobalMemory memoria;

    public Computador() {

        usuario = os.getProcess(0).getUser();
        hostname = os.getNetworkParams().getHostName();
        fabricante = hal.getComputerSystem().getManufacturer();
        modelo = hal.getComputerSystem().getModel();
        processador = hal.getProcessor().getName();
        ramTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        sistemaOperacional = si.getOperatingSystem().getFamily();
//        disco = FormatUtil.formatBytesDecimal(ds.getSize());

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

//    public String getDisco() {
//        return disco;
//    }
}
