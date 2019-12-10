/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private BasicDataSource conexao = new BasicDataSource();

    public BasicDataSource montarConexao() {

        try {

//            CONECTAR AO AZURE:
            conexao.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexao.setUrl("jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                    + "database=bdminehash;"
                    + "user=userminehash@srvminehash;"
                    + "password=#Gfgrupo1;"
                    + "encrypt=true;"
                    + "trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;"
                    + "loginTimeout=30;");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conexao;
    }

    public JdbcTemplate template() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao);
        return jdbcTemplate;
    }

}
