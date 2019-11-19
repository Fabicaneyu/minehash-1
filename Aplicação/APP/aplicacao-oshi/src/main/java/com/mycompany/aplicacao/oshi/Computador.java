package com.mycompany.aplicacao.oshi;

import oshi.SystemInfo;
import oshi.hardware.*;
import oshi.software.os.*;
import oshi.util.FormatUtil;

public class Computador extends Minerador {

    SystemInfo si = new SystemInfo();
    HardwareAbstractionLayer hal = si.getHardware();
    OperatingSystem os = si.getOperatingSystem();

    String hostname;
    String fabricante;
    String modelo;
    String processador;
    String ramTotal;
    String sistemaOperacional;

    public Computador() {

        hostname = os.getNetworkParams().getHostName();
        fabricante = hal.getComputerSystem().getManufacturer();
        modelo = hal.getComputerSystem().getModel();
        processador = hal.getProcessor().getName();
        ramTotal = FormatUtil.formatBytes(hal.getMemory().getTotal());
        sistemaOperacional = si.getOperatingSystem().getFamily();

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

}
