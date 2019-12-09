/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.usuario;

import com.minehash.alertas.SmsAlert;
import com.minehash.monitoramento.Processos;
import com.minehash.database.ConexaoBanco;
import com.minehash.monitoramento.Consumo;
import com.minehash.monitoramento.Logs;
import com.minehash.telas.TelaProcessos;
import com.minehash.telas.TelaCadastroComputador;
import com.minehash.telas.TelaMonitoramento;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Minerador {

    Integer idMinerador;
    Integer fkMinerador;
    String nome;
    String email;
    String senha;
    Boolean status;

    TelaCadastroComputador tela = new TelaCadastroComputador();
    TelaMonitoramento telaMon = new TelaMonitoramento();
    ConexaoBanco conectarBanco = new ConexaoBanco();
    SmsAlert mensagem = new SmsAlert();
    Consumo consumo = new Consumo();
    Computador comp = new Computador();

    String url;
    String usuario;
    String pass;

    public Minerador() {

        url = "jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                + "database=bdminehash;"
                + "user=userminehash@srvminehash;"
                + "password=#Gfgrupo1;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;";

        usuario = "userminehash@srvminehash";
        pass = "#Gfgrupo1";

    }

    public void logar(String e, String s) {

        String query = String.format("select id_usuario from tb_usuario where "
                + "nm_email = '%s' and "
                + "nm_senha = '%s'", e, s);

        selectQuery(url, usuario, pass, query);

        if (status.booleanValue() == true) {

            setEmail(e);
            setSenha(s);
            Consumo con = new Consumo();

            tela.setAutenticacao(getFkMinerador());
            tela.setEmail(e);
            tela.setSenha(s);
            tela.setId(getIdMinerador());
            tela.setFk(getFkMinerador());
            tela.setFkComputador(con.getFkComputador());

            checarCadastro();

        } else {

            System.out.println("ERRO DE LOGIN");

        }

        mensagem.enviarSMS("Olá, login realizado com sucesso! \n"
                + "EMAIL: " + getEmail()
        );
    }

    public void cadastrarComputador(String e, String s, Integer fk) {

        conectarBanco.montarConexao();
        comp.gpuUsuario();

        if (comp.gpuUsuario() == false) {

            conectarBanco.template().update(
                    "insert into tb_computador (fk_usuario, nm_disco, nm_ram, nm_processador, nm_so, nm_hostname,"
                    + " nm_modelo, nm_fabricante) values "
                    + "(?,?,?,?,?,?,?,?)",
                    fk, comp.getDisco(), comp.getRamTotal(), comp.getProcessador(), comp.getSistemaOperacional(),
                    comp.getHostname(), comp.getModelo(), comp.getFabricante());

        } else {

            conectarBanco.template().update(
                    "insert into tb_computador (fk_usuario, nm_gpu, nm_disco, nm_ram, nm_processador, nm_so, nm_hostname,"
                    + " nm_modelo, nm_fabricante) values "
                    + "(?,?,?,?,?,?,?,?,?)",
                    fk, comp.getGpu(), comp.getDisco(), comp.getRamTotal(), comp.getProcessador(), comp.getSistemaOperacional(),
                    comp.getHostname(), comp.getModelo(), comp.getFabricante());

        }

        System.out.println("COMPUTADOR CADASTRADO! Usuário liberado.");

        telaMon.setNomeUsuario(nome);
        telaMon.setProc(comp.getProcessador());
        telaMon.setSo(comp.getSistemaOperacional());
        telaMon.setRam(comp.getRamTotal());
        telaMon.setVisible(true);
        telaMon.setFk(consumo.getIdComputador());
        System.out.println(telaMon.getFk() +  "fkkkkk");
        

        mensagem.enviarSMS("Olá! O cadastro do seu equipamento foi realizado com sucesso!\n"
                + "DADOS:"
                + "\nUsuário: " + getEmail()
                + "\nSistema Operacional: " + comp.getSistemaOperacional()
                + "\nHostname: " + comp.getHostname()
                + "\n Para saber mais, acesso a aplicação!");
    }

    public void selectQuery(String url, String user, String password, String sql) {

        Connection connect = null;
        Statement statement = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            connect = DriverManager.getConnection(url, user, password);

            statement = connect.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Aguardando resultado...");

                setIdMinerador(resultSet.getInt("id_usuario"));
                setFkMinerador(resultSet.getInt("id_usuario"));

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            getIdMinerador();
            getFkMinerador();

            if (getIdMinerador() == null || getFkMinerador() == null) {

                setStatus(false);

            }
            System.out.println("NOME: " + getNome());
            System.out.println("ID: " + getIdMinerador());
            System.out.println("FK: " + getFkMinerador());
            setStatus(true);

            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                connect.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return;

    }

    public void checarCadastro() {

        if (tela.getEmail() == null || tela.getSenha() == null) {

            System.out.println("EMAIL E/OU SENHA VAZIOS");
            System.out.println("IMPOSSÍVEL EFETUAR CADASTRO");

        } else {

            String sql = String.format("select * from tb_computador where fk_usuario = %d", tela.getAutenticacao());
            int contador = 0;

            Connection connect = null;
            Statement statement = null;

            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                connect = DriverManager.getConnection(url, usuario, pass);

                statement = connect.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    System.out.println("Aguardando resultado...");

                    contador++;
                    System.out.println(contador);

                    tela.setAutenticacao(resultSet.getInt("fk_usuario"));

                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {

                if (getIdMinerador() == null || getFkMinerador() == null) {

                    System.out.println("ERRO DE LOGIN / ID NULL");

                } else if (tela.getAutenticacao() == null) {

                    System.out.println("NÃO HÁ MÁQUINAS CADASTRADAS PARA ESSE USUÁRIO");
                    System.out.println("-----------------------------");
                    System.out.println("CADASTRE AO MENOS UMA MÁQUINA PARA AVANÇAR");
                    tela.setVisible(true);

                } else {

                    if (contador == 0) {
                        System.out.println("NÃO HÁ MÁQUINAS CADASTRADAS PARA ESSE USUÁRIO");
                        tela.setVisible(true);

                    } else {

                        System.out.println("USUÁRIO POSSUI " + contador + " MÁQUINA(S) CADASTRADA(S)");
                        telaMon.setVisible(true);
                        telaMon.setNomeUsuario(nome);
                        telaMon.setProc(comp.getProcessador());
                        telaMon.setSo(comp.getSistemaOperacional());
                        telaMon.setRam(comp.getRamTotal());

                    }

                }

                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    connect.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
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

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
