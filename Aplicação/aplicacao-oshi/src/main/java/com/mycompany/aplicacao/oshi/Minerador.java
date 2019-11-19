package com.mycompany.aplicacao.oshi;

import com.sun.jna.platform.win32.WinNT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Minerador extends ConexaoBanco {

    ConexaoBanco conectarBanco = new ConexaoBanco();

    Integer idMinerador;
    Integer fkMinerador;
    String email;
    String senha;

    public void logar() {

        runQuery("jdbc:mysql://localhost:3306/minehash2?useTimezone=true&serverTimezone=UTC",
                "root",
                "Leo5767482200",
                "select idMinerador from Minerador where email = 'gabrieltinquim@gmail.com' and senha = 'teste'");

        return;

    }

    public void cadastrarComputador(String e, String s) {

        conectarBanco.montarConexao();

//        conectarBanco.template().update("insert into Computador (hostname, fabricante, modelo, processador, "
//                + "so, ram, fkMinerador) values (?,?,?,?,?,?,?)", usuarioPC.getHostname(), usuarioPC.getFabricante(),
//                usuarioPC.getModelo(), usuarioPC.getProcessador(), usuarioPC.getSistemaOperacional(),
//                usuarioPC.getRamTotal(), fkMinerador);
    }

    public void runQuery(String url, String user, String password, String sql) {
        Integer id;
        Minerador usuario = new Minerador();
        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            // ... add parameters to the SQL query using PreparedStatement methods:
            //     setInt, setString, etc.
            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    usuario.setIdMinerador(resultSet.getInt("idMinerador"));
                    return;

                }
            } finally {

                System.out.println(usuario.getIdMinerador());

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return;

    }

    public static void main(String[] args) {

        Minerador teste = new Minerador();

        teste.logar();

    }

    public void setIdMinerador(Integer idMinerador) {
        this.idMinerador = idMinerador;
    }

    public void setFkMinerador(Integer fkMinerador) {
        this.fkMinerador = fkMinerador;

    }

    public Integer getIdMinerador() {
        return idMinerador;
    }

    public Integer getFkMinerador() {
        return fkMinerador;
    }

}
