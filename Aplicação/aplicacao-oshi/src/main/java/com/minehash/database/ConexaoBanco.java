/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.database;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author ligimenes
 */
public class ConexaoBanco {

    private BasicDataSource conexao = new BasicDataSource();

    public BasicDataSource montarConexao() {

        try {
//            CONECTAR AO MYSQL WORKBENCH (LOCAL)
            conexao.setDriverClassName("com.mysql.cj.jdbc.Driver");
            conexao.setUrl("jdbc:mysql://localhost:3306/teste_oshi?useTimezone=true&serverTimezone=UTC");
            conexao.setUsername("root");
            conexao.setPassword("Leo5767482200");

//            CONECTAR AO AZURE:
            conexao.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexao.setUrl("jdbc:sqlserver://mineservidor.database.windows.net:1433;"
                    + "database=mineHash;"
                    + "user=minehash;"
                    + "password=Bandtec@2019;"
                    + "encrypt=true;trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conexao;
    }

    public JdbcTemplate template() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(conexao);
        return jdbcTemplate;
    }
    
    public void fazerLogin(String email, String senha){
        
          
        
        
    } 
    
    public void cadastrarPC(String email, String senha, Integer fkMinerador) {
        
        
        
        
        
        
    }
    
    

}
