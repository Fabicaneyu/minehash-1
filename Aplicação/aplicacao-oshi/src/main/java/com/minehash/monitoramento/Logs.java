/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.monitoramento;

import com.minehash.usuario.Computador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Logs {

    List<String> lista = new ArrayList<>();
    List<String> listaConsumo = new ArrayList<>();

    Computador comp = new Computador();
    Consumo consumo = new Consumo();

    LogManager lgmngr = LogManager.getLogManager();
    Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

    LocalDateTime periodo = LocalDateTime.now();

    DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy_MM_dd");
    DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH-mm");

    String formatData = periodo.format(data);
    String formatHora = periodo.format(hora);

    public void gerarLog() throws IOException {

        File arquivo = new File("log_geral_" + formatData + "_" + formatHora + ".log");

        arquivo.createNewFile();

        String urlArquivo = arquivo.getAbsolutePath();
        lista.add("----------------------------------------");
        lista.add("\n" + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        lista.add("----------------------------------------");
        lista.add(String.format("Hostname: %s", comp.getHostname()));
        lista.add(String.format("Fabricante: %s", comp.getFabricante()));
        lista.add(String.format("Modelo: %s", comp.getModelo()));
        lista.add(String.format("Processador: %s", comp.getProcessador()));
        lista.add(String.format("RAM Total: %s", comp.getRamTotal()));
        lista.add(String.format("Disco: %s", comp.getDisco()));
        lista.add(String.format("SO: %s", comp.getSistemaOperacional()));
        lista.add("----------------------------------------");
        lista.add("");

        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);

        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");
        System.out.println(getLista());
        System.out.println(arquivo.getAbsolutePath());

    }

    public void gerarLogConsumo() throws IOException {

        File arquivoConsumo = new File("log_consumo_" + formatData + "_" + formatHora + ".log");

        arquivoConsumo.createNewFile();

        String urlArquivo = arquivoConsumo.getAbsolutePath();
        listaConsumo.add("----------------------------------------");
        listaConsumo.add("\n" + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        listaConsumo.add("----------------------------------------");
        listaConsumo.add(String.format("Consumo de Disco: %s", consumo.getConsumoDisco() + "%"));
        listaConsumo.add(String.format("Consumo de Ram: %s", consumo.getConsumoRAM()));
        listaConsumo.add(String.format("Consumo de CPU: %s", consumo.getCpu() + "%"));
        listaConsumo.add(String.format("Temperatura CPU: %s Cº", consumo.getTemperaturaCPU()));
        listaConsumo.add("----------------------------------------");
        listaConsumo.add("");

        Files.write(Paths.get(arquivoConsumo.getPath()), listaConsumo, StandardOpenOption.APPEND);

        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");
        System.out.println(getListaConsumo());
        System.out.println(arquivoConsumo.getAbsolutePath());

    }

    public List<String> getLista() {
        return lista;
    }

    public List<String> getListaConsumo() {
        return listaConsumo;
    }

}
