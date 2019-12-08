/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.alertas;

import com.minehash.database.ConexaoBanco;
import com.minehash.monitoramento.Consumo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 *
 * @author yulima
 */
public class TelegramBot extends TelegramLongPollingBot {

    String email;
    String idTelegram;

    @Override
    public void onUpdateReceived(Update update) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        // Se tiver mensagens novas
        if (update.hasMessage()) {

            // Se a mensagem tiver Texto
            if (update.getMessage().hasText()) {

                // Texto da Mensagem
                String messageText = update.getMessage().getText();
                // ID do Chat
                Long chatId = update.getMessage().getChatId();

                if (messageText.equals("/start") || messageText.equals("/menu")) {
                    SendMessage message = new SendMessage()
                            .setChatId(chatId)
                            .setText("Escolha uma das opcões no seu teclado");

                    List<String> keyboardItems = new ArrayList<String>();
                    keyboardItems.add("/vincularConta");
                    keyboardItems.add("/desvincularConta");
                    keyboardItems.add("/statusMaquina");

                    ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();;
                    List<KeyboardRow> keyboard = new ArrayList<>();
                    KeyboardRow row = new KeyboardRow();

                    for (String item : keyboardItems) {
                        row.add(item);
                    }

                    keyboard.add(row);

                    keyboardMarkup.setKeyboard(keyboard);
                    keyboardMarkup.setResizeKeyboard(true);

                    message.setReplyMarkup(keyboardMarkup);

                    sendMessage(message);

                } else if (messageText.startsWith("/vincularConta")) {

                    SendMessage vincularConta = new SendMessage()
                            .setChatId(chatId);

                    if (messageText.endsWith(".com")) {
                        // Aqui ele vai procurar no banco se o e-mail existe
                        // Se existir, ele continua, se não ele retorna inválido
                        if (true) {

                            if (messageText.equals(getEmail())) {

                                if (getIdTelegram() == null) {
                                    setIdTelegram(vincularConta.getChatId());
                                    vincularEmail();
                                    vincularConta.setText("E-mail vinculado com sucesso");
                                    sendMessage(vincularConta);
                                } else {
                                    vincularConta.setText("Telegram Já registrado");
                                    sendMessage(vincularConta);

                                }
                            } else {
                                vincularConta.setText("E-mail Não registrado");
                                sendMessage(vincularConta);
                            }

                        } else {
                            // FALSE
                            vincularConta.setText("E-mail Não com sucesso");
                            sendMessage(vincularConta);
                        }
                    } else {
                        //
                    }
                } else if (messageText.startsWith("/desvincularConta")) {

                    SendMessage desvincularConta = new SendMessage()
                            .setChatId(chatId);

                    if (getIdTelegram() != null) {
                        desvincularConta.setText("Telegram desvinculado, você não receberá mais notificações.");
                        sendMessage(desvincularConta);
                    } else {

                        desvincularConta.setText("Ação Inválida.");

                    }

                } else if (messageText.startsWith("/statusMaquina")) {

                    Consumo consumo = new Consumo();
                    String msgStatusMaquina = "";

                    if (consumo.gpuUsuario() == false) {

                        msgStatusMaquina = "STATUS:"
                                + "\n Consumo de disco: " + consumo.getConsumoDisco().toString() + "%"
                                + "\n Consumo de memória: " + consumo.getConsumoRAM()
                                + "\n Consumo de CPU: " + consumo.getCpu().toString() + "%"
                                + "\n Consumo de GPU: " + consumo.getGpu();
                    } else {

                        msgStatusMaquina = "STATUS:"
                                + "\n Consumo de disco: " + consumo.getConsumoDisco().toString() + "%"
                                + "\n Consumo de memória: " + consumo.getConsumoRAM()
                                + "\n Consumo de CPU: " + consumo.getCpu().toString() + "%";

                    }

                    SendMessage statusMaquina = new SendMessage()
                            .setChatId(chatId)
                            .setText(msgStatusMaquina);
                    sendMessage(statusMaquina);

                } else {
                    SendMessage unknownCommand = new SendMessage()
                            .setChatId(chatId)
                            .setText("Por favor, digite \"/start\" ou \"/menu\"");
                    sendMessage(unknownCommand);
                }
            }
        }
    }

    public void query(String messageEmail) {

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

            ResultSet resultSet = statement.executeQuery(String.format("select * from tb_usuario where "
                    + "nm_email = '%s'", messageEmail));

            while (resultSet.next()) {

                System.out.println("Aguardando resultado...");

                setEmail(resultSet.getString("nm_email"));
                setIdTelegram(resultSet.getString("id_telegram"));

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            System.out.println("EMAIL: " + getEmail());
            System.out.println("ID_TELEGRAM: " + getIdTelegram());

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

        return;

    }

    public void vincularEmail() {

        ConexaoBanco con = new ConexaoBanco();
        con.montarConexao();
        con.template().update(
                "update tb_usuario set id_telegram = ? where nm_email = ?",
                getIdTelegram(), getEmail());

    }

    public void sendMessage(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "MineHash Alerts Bot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdTelegram() {
        return idTelegram;
    }

    public void setIdTelegram(String idTelegram) {
        this.idTelegram = idTelegram;
    }

}
