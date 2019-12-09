/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.alertas;

import com.minehash.usuario.Computador;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsAlert {

    public static final String ACCOUNT_SID = "AC2dbb87b4948fe6080ee79bae5866370a";
    public static final String AUTH_TOKEN = "37fc14f677d6203270c83d9b4898a35e";

    public void enviarSMS(String conteudo) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+5511959358729"), new PhoneNumber("(202) 517-0883"),
                        conteudo
                ).create();

        System.out.println(message.getSid());

    }

}
