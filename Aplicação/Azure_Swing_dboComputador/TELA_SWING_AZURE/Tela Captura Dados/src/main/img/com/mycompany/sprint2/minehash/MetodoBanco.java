
package com.mycompany.sprint2.minehash;


public class MetodoBanco extends DadosOshi {
    
    
    ConexaoBanco conexao = new ConexaoBanco();
    
    public void enviarBanco() {
        conexao.getConnection();
        conexao.template().update(
                "insert into Computador (GPU, DISCO, RAM, Processador, SO,"
                        + " Hostname, Modelo, Fabricante, fkMinerador) "
                        + "values (?,?,?,?,?,?,?,?,19)",
               getGpu(), getDisco(), getMemoriaTotal(), getProcessador(),
                getSo(), getHostname(), getModelo(), getFabricante());
    }
}
