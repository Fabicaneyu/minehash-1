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

    public static final String ACCOUNT_SID = "AC5e0e8b7e2338d814b71e30e5865c8f89";
    public static final String AUTH_TOKEN = "7be2acb0d707e69352bcd23d6480a56d";

    public void enviarSMS() {
        
        Computador comp = new Computador();
        
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+5511959358729"), new PhoneNumber("+12029198974"),
                        "Olá, Leonardo. Aqui está seu relatório: "
                        + "\nHostname: " + comp.getHostname()
                        + "\nFabricante: " + comp.getFabricante()
                        + "\nModelo: " + comp.getModelo()
                        + "\nProcessador: " + comp.getProcessador()
                        + "\nMemóriaTotal: " + comp.getRamTotal()
                        + "\nSistema: " + comp.getSistemaOperacional()
                ).create();

        System.out.println(message.getSid());

    }

}
