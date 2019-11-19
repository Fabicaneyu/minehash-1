package com.mycompany.aplicacao.oshi;

import java.sql.PreparedStatement;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private BasicDataSource conexao = new BasicDataSource();

    public BasicDataSource montarConexao() {

        try {
//            conexao.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//            conexao.setUrl("jdbc:sqlserver://mineservidor.database.windows.net:1433;"
//                    + "database=mineHash;user=minehash@mineservidor;password=Bandtec@2019;"
//                    + "encrypt=true;trustServerCertificate=false;"
//                    + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");

            conexao.setDriverClassName("com.mysql.cj.jdbc.Driver");
            conexao.setUrl("jdbc:mysql://localhost:3306/minehash2?useTimezone=true&serverTimezone=UTC");
            conexao.setUsername("root");
            conexao.setPassword("Leo5767482200");

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
