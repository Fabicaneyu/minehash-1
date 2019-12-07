/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yuriuliam.telegram.bot;

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
              // TRUE
              // if (emailDaString == emailDaQueryDoBacno) {
              //    if (query.idTelegram == null) {
              //      queryParaVincularEmail();
              //      vincularConta.setText("E-mail vinculado com sucesso");
              //      sendMessage(vincularConta);
              //    } else {
              //      vincularConta.setText("Telegram Já registrado");
              //      sendMessage(vincularConta);
              //    }
              // } else {
              //    vincularConta.setText("E-mail Não registrado");
              //    sendMessage(vincularConta);
              // }
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
          
          // if (queryDoBanco.temIdTelegram) [
          //    desvincular.setText("Telegram desvinculado, você não receberá mais notificações.");
          // sendMessage(desvincularConta);
          // } else {
          //    desvincular.setText("Ação Inválida.");
          // }
        } else if (messageText.startsWith("/statusMaquina")) {
          
          String msgStatusMaquina = "";// <-- Coloque o retorno do status da máquina Aqui em STRING!
          
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
  
  
}
