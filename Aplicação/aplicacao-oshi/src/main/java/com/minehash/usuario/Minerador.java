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
    Boolean status;

    TelaCadastroComputador tela = new TelaCadastroComputador();
    TelaProcessos telaProc = new TelaProcessos();
    ConexaoBanco conectarBanco = new ConexaoBanco();
    SmsAlert mensagem = new SmsAlert();
    Logs logs = new Logs();

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

            tela.setVisible(true);
            tela.setEmail(e);
            tela.setSenha(s);
            tela.setId(getIdMinerador());
            tela.setFk(getFkMinerador());
            tela.setAutenticacao(getFkMinerador());
            checarCadastro();

        } else {

            System.out.println("ERRO DE LOGIN");

        }

        mensagem.enviarSMS("Olá, um login foi realizado: \n"
                + "EMAIL: " + getEmail());

        return;

    }

    public void cadastrarComputador(String e, String s, Integer fk) {

        Computador comp = new Computador();

        conectarBanco.montarConexao();
        conectarBanco.template().update(
                "insert into tb_computador (fk_usuario, nm_ram, nm_disco, nm_processador, nm_so, nm_hostname,"
                + " nm_modelo, nm_fabricante) values "
                + "(?,?,?,?,?,?,?,?)",
                fk, comp.getRamTotal(), comp.getDisco(),
                comp.getProcessador(), comp.getSistemaOperacional(),
                comp.getHostname(), comp.getModelo(), comp.getFabricante());

        System.out.println("COMPUTADOR CADASTRADO! Usuário liberado.");
        mensagem.enviarSMS("Olá! O cadastro do seu equipamento foi realizado com sucesso!\n"
                + "DADOS:\n"
                + "Usuário: " + comp.getUsuario()
                + "Sistema Operacional: " + comp.getSistemaOperacional()
                + "Hostname: " + comp.getHostname()
                + "\n Para saber mais, acesso a aplicação!");

        telaProc.setVisible(true);

    }

    public void selectQuery(String url, String user, String password, String sql) {

        try (
                Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {

                    setIdMinerador(resultSet.getInt("id_usuario"));
                    setFkMinerador(resultSet.getInt("id_usuario"));

                }
            } finally {

                getIdMinerador();
                getFkMinerador();
                System.out.println("ID: " + getIdMinerador());
                System.out.println("FK: " + getFkMinerador());
                setStatus(true);
                getStatus();
                return;
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return;

    }

    public void checarCadastro() {

        if (tela.getEmail() == null || tela.getSenha() == null) {

            System.out.println("IMPOSSÍVEL EFETUAR CADASTRO DE MÁQUINA");

        } else {

            String sql = String.format("select * from tb_computador where fk_usuario = %d", tela.getAutenticacao());
            int contador = 0;

            try (
                    Connection connection = DriverManager.getConnection(url, usuario, pass);
                    PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                try (ResultSet resultSet = preparedStatement.executeQuery()) {

                    while (resultSet.next()) {

                        contador++;
                        System.out.println(contador);

                        tela.setAutenticacao(resultSet.getInt("fk_usuario"));

                    }
                } finally {

                    if (tela.getAutenticacao() == null) {

                        System.out.println("NÃO HÁ MÁQUINAS CADASTRADAS PARA ESSE USUÁRIO");
                        System.out.println("-----------------------------");
                        System.out.println("CADASTRE AO MENOS UMA MÁQUINA PARA AVANÇAR");

                    } else {

                        System.out.println("USUÁRIO POSSUI " + contador + " MÁQUINA(S) CADASTRADA(S)");

                    }

                    return;
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }

            return;

        }

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
        Integer fk = teste.getFkMinerador();
        teste.cadastrarComputador(emailTeste, senhaTeste, fk);

        procT.inserirProcessosQuery(fk);

        con.inserirDesempenhoQuery(fk);

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

}
