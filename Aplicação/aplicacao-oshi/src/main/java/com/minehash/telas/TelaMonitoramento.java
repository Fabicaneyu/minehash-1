/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.telas;

import com.minehash.monitoramento.Consumo;
import com.minehash.monitoramento.Processos;
import com.minehash.usuario.Computador;
import java.awt.Color;
import java.awt.Point;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author ligimenes
 */
public class TelaMonitoramento extends javax.swing.JFrame {

    private Point point = new Point();

    String nomeUsuario;
    String so;
    String proc;
    String ram;
    int qtdProcessos;
    String disco;
    Integer fk;

    /**
     * Creates new form TelaMonitoramento
     */
    public TelaMonitoramento() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pbCPU = new javax.swing.JProgressBar();
        lbD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNomeUsuario = new javax.swing.JLabel();
        lbQ = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lbC = new javax.swing.JLabel();
        lbTempGPU = new javax.swing.JLabel();
        pbDisco = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbProc = new javax.swing.JLabel();
        lbTempCPU = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btMonitorar = new javax.swing.JButton();
        lbR = new javax.swing.JLabel();
        lbSistemaOperacional = new javax.swing.JLabel();
        lbMemoria = new javax.swing.JLabel();
        lbProcessador = new javax.swing.JLabel();
        btProp1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbRAM = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(17, 63, 64));
        jPanel1.setMaximumSize(new java.awt.Dimension(647, 60));
        jPanel1.setMinimumSize(new java.awt.Dimension(647, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(647, 60));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MineHash");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        jPanel2.setBackground(new java.awt.Color(108, 117, 120));
        jPanel2.setMaximumSize(new java.awt.Dimension(3276, 32767));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BEM VINDO,");

        pbCPU.setStringPainted(true);

        lbD.setForeground(new java.awt.Color(255, 255, 255));
        lbD.setText("DISCO RÍGIDO:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROCESSADOR:");

        lbNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeUsuario.setText("USUÁRIO");

        lbQ.setForeground(new java.awt.Color(255, 255, 255));
        lbQ.setText("QUANTIDADE DE PROCESSOS ABERTOS:");

        jButton2.setBackground(new java.awt.Color(253, 79, 90));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("FECHAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbC.setForeground(new java.awt.Color(255, 255, 255));
        lbC.setText("CPU:");

        lbTempGPU.setForeground(new java.awt.Color(255, 255, 255));
        lbTempGPU.setText("00");

        pbDisco.setStringPainted(true);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MEMÓRIA RAM:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("22/09/2019");

        lbProc.setForeground(new java.awt.Color(255, 255, 255));
        lbProc.setText("0");

        lbTempCPU.setForeground(new java.awt.Color(255, 255, 255));
        lbTempCPU.setText("00");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TEMPERATURA GPU:");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA OPERACIONAL:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TEMPERATURA CPU:");

        btMonitorar.setBackground(new java.awt.Color(10, 14, 13));
        btMonitorar.setForeground(new java.awt.Color(240, 240, 240));
        btMonitorar.setText("MONITORAR");
        btMonitorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMonitorarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMonitorarMouseExited(evt);
            }
        });
        btMonitorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMonitorarActionPerformed(evt);
            }
        });

        lbR.setForeground(new java.awt.Color(255, 255, 255));
        lbR.setText("RAM:");

        lbSistemaOperacional.setText("---------------------------");

        lbMemoria.setText("------------------------------------------");

        lbProcessador.setText("------------------------------------------");

        btProp1.setBackground(new java.awt.Color(10, 14, 13));
        btProp1.setForeground(new java.awt.Color(240, 240, 240));
        btProp1.setText("PROCESSOS");
        btProp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btProp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btProp1MouseExited(evt);
            }
        });
        btProp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProp1ActionPerformed(evt);
            }
        });

        jButton1.setText("CADASTRAR COMPUTADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbRAM.setText("0 MB");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMonitorar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbD)
                            .addComponent(lbR)
                            .addComponent(pbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbC)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(lbQ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbProc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTempCPU, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                                    .addComponent(lbTempGPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbNomeUsuario)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(lbTempCPU)
                    .addComponent(lbSistemaOperacional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(lbTempGPU)
                    .addComponent(lbMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbProcessador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQ)
                    .addComponent(lbProc))
                .addGap(11, 11, 11)
                .addComponent(lbC)
                .addGap(9, 9, 9)
                .addComponent(pbCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lbR)
                .addGap(18, 18, 18)
                .addComponent(lbRAM)
                .addGap(15, 15, 15)
                .addComponent(lbD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btProp1)
                    .addComponent(btMonitorar)
                    .addComponent(jButton1))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btMonitorarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonitorarMouseEntered
        btMonitorar.setBackground(new Color(17, 63, 64));
    }//GEN-LAST:event_btMonitorarMouseEntered

    private void btMonitorarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMonitorarMouseExited
        btMonitorar.setBackground(new Color(5, 13, 14));
    }//GEN-LAST:event_btMonitorarMouseExited

    private void btMonitorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMonitorarActionPerformed
        // TODO add your handling code here:
        Computador comp = new Computador();

        lbSistemaOperacional.setText(comp.getSistemaOperacional());
        lbProcessador.setText(comp.getProcessador());
        lbMemoria.setText(comp.getRamTotal());
        lbProc.setText(String.valueOf(comp.os.getProcessCount()));

        int delay = 2000;   // tempo de espera antes da 1ª execução da tarefa.
        int interval = 2000;  // intervalo no qual a tarefa será executada.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            Consumo cons = new Consumo();

            public void run() {

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();

                pbDisco.setValue(cons.getConsumoDisco().intValue());
//                pbRAM.setValue(Integer.valueOf(cons.getConsumoRAM()));
                pbCPU.setValue(cons.getCpu().intValue());
                lbTempCPU.setText(String.valueOf(cons.getTemperaturaCPU()));
                lbRAM.setText(String.valueOf(cons.getConsumoRAM().toString()));
                
            }
        }, delay, interval);


    }//GEN-LAST:event_btMonitorarActionPerformed

    private void btProp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProp1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btProp1MouseEntered

    private void btProp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProp1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btProp1MouseExited

    private void btProp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProp1ActionPerformed
        // TODO add your handling code here:
        TelaProcessos telaProc = new TelaProcessos();
        telaProc.setVisible(true);
    }//GEN-LAST:event_btProp1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        TelaCadastroComputador telaC = new TelaCadastroComputador();
        telaC.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMonitoramento().setVisible(true);

            }

        });

    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getQtdProcessos() {
        return qtdProcessos;
    }

    public void setQtdProcessos(int qtdProcessos) {
        this.qtdProcessos = qtdProcessos;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public void setLbMemoria(JLabel lbMemoria) {
        this.lbMemoria = lbMemoria;
    }

    public void setLbNomeUsuario(JLabel lbNomeUsuario) {
        this.lbNomeUsuario = lbNomeUsuario;
    }

    public void setLbProc(JLabel lbProc) {
        this.lbProc = lbProc;
    }

    public void setLbProcessador(JLabel lbProcessador) {
        this.lbProcessador = lbProcessador;
    }

    public void setLbSistemaOperacional(JLabel lbSistemaOperacional) {
        this.lbSistemaOperacional = lbSistemaOperacional;
    }

    public void setLbTempCPU(JLabel lbTempCPU) {
        this.lbTempCPU = lbTempCPU;
    }

    public void setLbTempGPU(JLabel lbTempGPU) {
        this.lbTempGPU = lbTempGPU;
    }

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMonitorar;
    private javax.swing.JButton btProp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbD;
    private javax.swing.JLabel lbMemoria;
    private javax.swing.JLabel lbNomeUsuario;
    private javax.swing.JLabel lbProc;
    private javax.swing.JLabel lbProcessador;
    private javax.swing.JLabel lbQ;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lbRAM;
    private javax.swing.JLabel lbSistemaOperacional;
    private javax.swing.JLabel lbTempCPU;
    private javax.swing.JLabel lbTempGPU;
    private javax.swing.JProgressBar pbCPU;
    private javax.swing.JProgressBar pbDisco;
    // End of variables declaration//GEN-END:variables
}
