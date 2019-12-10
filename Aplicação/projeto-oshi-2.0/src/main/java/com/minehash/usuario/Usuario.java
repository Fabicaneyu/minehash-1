/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.usuario;

import com.minehash.computador.Computador;
import com.minehash.database.ConexaoBanco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author marco
 */
public class Usuario {

    Integer idUsuario;
    Integer fkUsuario;

    String email;
    String senha;
    Boolean status;
    Boolean pc;

    public void logar(String e, String s) {

        String query = String.format("select id_usuario from tb_usuario where "
                + "nm_email = '%s' and "
                + "nm_senha = '%s'", e, s);

        consultarIdUsuario(query);

        if (status.booleanValue() == true) {

            setEmail(e);
            setSenha(s);
            checarCadastro();

        } else {

            System.out.println("ERRO DE LOGIN");

        }

//        mensagem.enviarSMS("Olá, login realizado com sucesso! \n"
//                + "EMAIL: " + getEmail()
//        );
    }

    public void consultarIdUsuario(String sql) {

        Connection connect = null;
        Statement statement = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            connect = DriverManager.getConnection("jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                    + "database=bdminehash;"
                    + "user=userminehash@srvminehash;"
                    + "password=#Gfgrupo1;"
                    + "encrypt=true;"
                    + "trustServerCertificate=false;"
                    + "hostNameInCertificate=*.database.windows.net;"
                    + "loginTimeout=30;",
                    "userminehash@srvminehash",
                    "#Gfgrupo1");

            statement = connect.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                System.out.println("Atribuindo valores a ID_USUARIO e FK_USUARIO...");

                setIdUsuario(resultSet.getInt("id_usuario"));
                setFkUsuario(resultSet.getInt("id_usuario"));

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (getIdUsuario() == null || getFkUsuario() == null) {

                setStatus(false);

            } else {

                System.out.println("ID: " + getIdUsuario());
                System.out.println("FK: " + getFkUsuario());
                setStatus(true);

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

        return;

    }

    public void checarCadastro() {

        if (getEmail() == null || getSenha() == null) {

            System.out.println("EMAIL E/OU SENHA VAZIOS");
            System.out.println("IMPOSSÍVEL EFETUAR CADASTRO");

        } else {

            String sql = String.format("select * from tb_computador where fk_usuario = %d", getFkUsuario());
            int contador = 0;

            Connection connect = null;
            Statement statement = null;

            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                connect = DriverManager.getConnection("jdbc:sqlserver://srvminehash.database.windows.net:1433;"
                        + "database=bdminehash;"
                        + "user=userminehash@srvminehash;"
                        + "password=#Gfgrupo1;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "hostNameInCertificate=*.database.windows.net;"
                        + "loginTimeout=30;",
                        "userminehash@srvminehash",
                        "#Gfgrupo1");

                statement = connect.createStatement();

                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {

                    System.out.println("Aguardando resultado...");
                    contador++;

                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {

                if (getIdUsuario() == null || getFkUsuario() == null) {

                    setStatus(false);
                    System.out.println("ERRO DE LOGIN / ID NULL");

                } else if (getFkUsuario() == null) {

                    System.out.println("NÃO HÁ MÁQUINAS CADASTRADAS PARA ESSE USUÁRIO");
                    System.out.println("-----------------------------");
                    System.out.println("CADASTRE AO MENOS UMA MÁQUINA PARA AVANÇAR");
                    

                } else {
                    System.out.println("LOGIN REALIZADO COM SUCESSO!");

                    if (contador == 0) {
                        System.out.println("NÃO HÁ MÁQUINAS CADASTRADAS PARA ESSE USUÁRIO");
                        setPc(false);
                    } else {
                        System.out.println("USUÁRIO POSSUI " + contador + " MÁQUINA(S) CADASTRADA(S)");
                        setPc(true);
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

    public void cadastrarComputador(Integer fk) {

        ConexaoBanco conectarBanco = new ConexaoBanco();
        conectarBanco.montarConexao();

        Computador comp = new Computador();
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

//        mensagem.enviarSMS("Olá! O cadastro do seu equipamento foi realizado com sucesso!\n"
//                + "DADOS:"
//                + "\nUsuário: " + getEmail()
//                + "\nSistema Operacional: " + comp.getSistemaOperacional()
//                + "\nHostname: " + comp.getHostname()
//                + "\n Para saber mais, acesso a aplicação!");
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Integer fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getPc() {
        return pc;
    }

    public void setPc(Boolean pc) {
        this.pc = pc;
    }
    
    

}
