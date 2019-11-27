package com.minehash.monitoramento;

import com.minehash.usuario.Minerador;
import com.minehash.usuario.Computador;
import com.profesorfalken.jsensors.JSensors;
import com.profesorfalken.jsensors.model.components.Components;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;
import oshi.util.FormatUtil;

public class ConsumoPC {

    Minerador minerador = new Minerador();
    Computador comp = new Computador();
    Components components = JSensors.get.components();

    Double consumoCPU;
    String consumoRAM;
    Double consumoDisco;
    Double consumoGPU;
    Double temperaturaPC;
    Integer fkComputador;
    FileSystem consumo;

    public ConsumoPC() {

        consumoRAM = FormatUtil.formatBytes(comp.hal.getMemory().getAvailable());

    }

    public void arquivos() {

        OSFileStore[] fsArray = consumo.getFileStores();

        consumo.getOpenFileDescriptors();
        consumo.getMaxFileDescriptors();

        for (OSFileStore fs : fsArray) {

            long disponivel = fs.getUsableSpace();
            long total = fs.getTotalSpace();
            
            System.out.println(FormatUtil.formatBytes(disponivel));
            System.out.println("-----");
            System.out.println(FormatUtil.formatBytes(total));
        }

    }

   

}
