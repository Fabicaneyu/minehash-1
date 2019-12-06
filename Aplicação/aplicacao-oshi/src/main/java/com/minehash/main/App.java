/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.main;

import com.minehash.monitoramento.Logs;
import com.minehash.telas.TelaLogin;
import java.io.IOException;

/**
 *
 * @author marco
 */
public class App {

    public static void main(String[] args) throws IOException {

        TelaLogin telaApp = new TelaLogin();
        telaApp.setVisible(true);

    }

}
