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

    Computador comp = new Computador();
    List<String> lista = new ArrayList<>();

    LogManager lgmngr = LogManager.getLogManager();
    Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

    LocalDateTime periodo = LocalDateTime.now();

    DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy_MM_dd");
    DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH-mm");

    String formatData = periodo.format(data);
    String formatHora = periodo.format(hora);

    public void gerarLogs() throws IOException {

        File arquivo = new File("data - " + formatData + "- hora - " + formatHora + ".log");
        Processos procs = new Processos();

        arquivo.createNewFile();
        String urlArquivo = arquivo.getAbsolutePath();
        lista.add("----------------------------------------");
        lista.add("\n" + LocalDateTime.now().format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        lista.add("----------------------------------------");
        lista.add(String.format("Hostname: %s", comp.getHostname()));
        lista.add(String.format("Fabricante: %s", comp.getFabricante()));
        lista.add(String.format("Modelo: %s", comp.getModelo()));
        lista.add(String.format("Processador: %s", comp.getProcessador()));
        lista.add(String.format("RAM Total: %s", comp.getRamTotal()));
        lista.add(String.format("SO: %s", comp.getSistemaOperacional()));
        lista.add("----------------------------------------");
        lista.add("----------------------------------------");

        Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);

        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");
        System.out.println(getLista());
        System.out.println(arquivo.getAbsolutePath());

        Runtime.getRuntime().exec("explorer.exe " + urlArquivo);

    }

    public void gerarLogsConsumo() throws IOException {

        File arquivoConsumo = new File("CONSUMO - data - " + formatData + "- hora - " + formatHora + ".log");

        arquivoConsumo.createNewFile();
        String urlArquivo = arquivoConsumo.getAbsolutePath();
        Consumo consumo = new Consumo();
        lista.add("----------------------------------------");
        lista.add("\n" + LocalDateTime.now().format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        lista.add("----------------------------------------");
        lista.add(String.format("Temperatura CPU: %d", consumo.getTemperaturaCPU()));
        lista.add(String.format("Consumo de RAM: %d", consumo.getConsumoRAM()));
        lista.add(String.format("Consumo de Disco Rígido: %d", consumo.getConsumoDisco()));
        lista.add("----------------------------------------");
        lista.add("----------------------------------------");

        Files.write(Paths.get(arquivoConsumo.getPath()), lista, StandardOpenOption.APPEND);

        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");
        System.out.println(getLista());
        System.out.println(arquivoConsumo.getAbsolutePath());

        Runtime.getRuntime().exec("explorer.exe " + urlArquivo);

    }

    public void gerarLogsProcessos(String user, Integer pid, String nmProc, String status, Double cpu) throws IOException {

        File arquivoProcessos = new File("PROCESSOS - data - " + formatData + "- hora - " + formatHora + ".log");
        arquivoProcessos.createNewFile();

        String urlArquivo = arquivoProcessos.getAbsolutePath();

        lista.add("----------------------------------------");
        lista.add("\n" + LocalDateTime.now().format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        lista.add("----------------------------------------");
        lista.add("PROCESSOS ABERTOS: \n");
        lista.add(String.format("USUÁRIO: %s", user));
        lista.add(String.format("PID: %d", pid));
        lista.add(String.format("NOME_PROCESSO: %s", nmProc));
        lista.add(String.format("STATUS: %s", status));
        lista.add(String.format("CONSUMO CPU: %d", cpu));
        lista.add("----------------------------------------");

        Files.write(Paths.get(arquivoProcessos.getPath()), lista, StandardOpenOption.APPEND);

        log.log(Level.INFO, "LOG_Info_PC_Usuario: \n ");
        System.out.println(getLista());
        System.out.println(arquivoProcessos.getAbsolutePath());

        Runtime.getRuntime().exec("explorer.exe " + urlArquivo);

    }

    public List<String> getLista() {
        return lista;
    }

}
