/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.usuario;

import com.minehash.monitoramento.Processos;
import com.minehash.database.ConexaoBanco;
import com.minehash.monitoramento.Consumo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Minerador {

    Integer idMinerador;
    Integer fkMinerador;
    String email;
    String senha;

    public void logar(String e, String s) {

        String query = String.format("select idMinerador from Minerador where email = '%s' and senha = '%s'", e, s);

        selectQuery("jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                + "database=bdminehash;"
                + "user=userminehash@srvminehash;"
                + "password=#Gfgrupo1;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;",
                "userminehash@srvminehash",
                "#Gfgrupo1", query);

        return;

    }

    public void cadastrarComputador(String e, String s) {

        Computador comp = new Computador();
        ConexaoBanco conectarBanco = new ConexaoBanco();

        conectarBanco.montarConexao();
        conectarBanco.template().update(
                "insert into Computador (hostname, fabricante, modelo, processador,"
                + " sistemaOperacional, memoriaRam, fkMinerador) values (?,?,?,?,?,?,?)",
                comp.getHostname(), comp.getFabricante(), comp.getModelo(),
                comp.getProcessador(), comp.getSistemaOperacional(),
                comp.getRamTotal(), getFkMinerador());

    }

    public void selectQuery(String url, String user, String password, String sql) {

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    setIdMinerador(resultSet.getInt("idMinerador"));
                    setFkMinerador(resultSet.getInt("idMinerador"));

                }
            } finally {

                getIdMinerador();
                getFkMinerador();
                System.out.println("ID: " + getIdMinerador());
                System.out.println("FK: " + getFkMinerador());

                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return;

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Minerador teste = new Minerador();
        Processos procT = new Processos();
        Consumo con = new Consumo();

        System.out.println("Email: ");
        String emailTeste = leitor.next();

        System.out.println("Senha: ");
        String senhaTeste = leitor.next();

        teste.logar(emailTeste, senhaTeste);
        teste.cadastrarComputador(emailTeste, senhaTeste);
        Integer fk = teste.getFkMinerador();
        procT.inserirProcessosQuery(fk);
        
        con.inserirDesempenhoQuery(fk);
        
        
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
