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

    Consumo consumo = new Consumo();
    Computador comp = new Computador();
    
    List<String> listaLog = new ArrayList<>();
    List<String> listaConsumo = new ArrayList<>();

    LogManager lgmngr = LogManager.getLogManager();
    Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

    LocalDateTime periodo = LocalDateTime.now();

    DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy_MM_dd");
    DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH-mm");

    String formatData = periodo.format(data);
    String formatHora = periodo.format(hora);

    public void gerarLogs() throws IOException {

        File arquivo = new File("data - " + formatData + "- hora - " + formatHora + ".log");
        
        arquivo.createNewFile();
        String urlArquivo = arquivo.getAbsolutePath();
        listaLog.add("----------------------------------------");
        listaLog.add("\n" + LocalDateTime.now().format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        listaLog.add("----------------------------------------");
        listaLog.add(String.format("Hostname: %s", comp.getHostname()));
        listaLog.add(String.format("Fabricante: %s", comp.getFabricante()));
        listaLog.add(String.format("Modelo: %s", comp.getModelo()));
        listaLog.add(String.format("Processador: %s", comp.getProcessador()));
        listaLog.add(String.format("RAM Total: %s", comp.getRamTotal()));
        listaLog.add(String.format("SO: %s", comp.getSistemaOperacional()));
        listaLog.add("----------------------------------------");
        listaLog.add("----------------------------------------");

        Files.write(Paths.get(arquivo.getPath()), listaLog, StandardOpenOption.APPEND);

    }

    public void gerarLogsConsumo() throws IOException {

        File arquivoConsumo = new File("CONSUMO - data - " + formatData + "- hora - " + formatHora + ".log");

        arquivoConsumo.createNewFile();
        String urlArquivo = arquivoConsumo.getAbsolutePath();
        
        listaConsumo.add("----------------------------------------");
        listaConsumo.add("\n" + LocalDateTime.now().format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        listaConsumo.add("----------------------------------------");
        listaConsumo.add(String.format("Temperatura CPU: %d", consumo.getTemperaturaCPU()));
        listaConsumo.add(String.format("Consumo de RAM: %d", consumo.getConsumoRAM()));
        listaConsumo.add(String.format("Consumo de Disco Rígido: %d", consumo.getConsumoDisco()));
        listaConsumo.add("----------------------------------------");
        listaConsumo.add("----------------------------------------");

        Files.write(Paths.get(arquivoConsumo.getPath()), listaConsumo, StandardOpenOption.APPEND);

        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");

        System.out.println(arquivoConsumo.getAbsolutePath());

    }

//    public void gerarLogsProcessos(String user, Integer pid, String nmProc, String status, Double cpu) throws IOException {
//
//        File arquivoProcessos = new File("PROCESSOS - data - " + formatData + "- hora - " + formatHora + ".log");
//        arquivoProcessos.createNewFile();
//
//        String urlArquivo = arquivoProcessos.getAbsolutePath();
//
//        lista.add("----------------------------------------");
//        lista.add("\n" + LocalDateTime.now().format(
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
//        lista.add("----------------------------------------");
//        lista.add("PROCESSOS ABERTOS: \n");
//        lista.add(String.format("USUÁRIO: %s", user));
//        lista.add(String.format("PID: %d", pid));
//        lista.add(String.format("NOME_PROCESSO: %s", nmProc));
//        lista.add(String.format("STATUS: %s", status));
//        lista.add(String.format("CONSUMO CPU: %d", cpu));
//        lista.add("----------------------------------------");
//
//        Files.write(Paths.get(arquivoProcessos.getPath()), lista, StandardOpenOption.APPEND);
//
//        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");
//        System.out.println(getLista());
//        System.out.println(arquivoProcessos.getAbsolutePath());
//
//        Runtime.getRuntime().exec("explorer.exe " + urlArquivo);
//
//    }
// public List<String> getLista() {
//        return lista;
//    }
}
