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

    public static final String ACCOUNT_SID = "ACce49cdcce0902ae6fc5b60956ba37594";
    public static final String AUTH_TOKEN = "7baf3e53c3620dc4cd4d3f88e3ff7c12";

    public void enviarSMS(String conteudo) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+5511959358729"), new PhoneNumber("+12055576890"),
                        conteudo
                ).create();

        System.out.println(message.getSid());

    }

}
