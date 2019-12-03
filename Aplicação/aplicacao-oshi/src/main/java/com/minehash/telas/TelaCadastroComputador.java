/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.telas;

import com.minehash.usuario.Minerador;
import java.awt.Color;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author marco
 */
public class TelaCadastroComputador extends javax.swing.JFrame {
private Point point = new Point();
    String email;
    String senha;
    Integer id;
    Integer fk;
    Integer autenticacao;

    public TelaCadastroComputador() {
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

        lbStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btCadastro = new javax.swing.JButton();
        btAvancar = new javax.swing.JButton();
        btAvancar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        lbStatus.setText("-----------------------------------------------------");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(108, 117, 125));
        setMaximizedBounds(new java.awt.Rectangle(20, 20, 20, 20));
        setMaximumSize(new java.awt.Dimension(422, 400));
        setMinimumSize(new java.awt.Dimension(422, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(422, 400));
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

        jPanel3.setBackground(new java.awt.Color(108, 117, 125));
        jPanel3.setMaximumSize(new java.awt.Dimension(410, 400));
        jPanel3.setPreferredSize(new java.awt.Dimension(422, 360));

        btCadastro.setBackground(new java.awt.Color(10, 13, 13));
        btCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btCadastro.setText("CADASTRAR COMPUTADOR");
        btCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btCadastroMouseExited(evt);
            }
        });
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        btAvancar.setBackground(new java.awt.Color(10, 13, 14));
        btAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btAvancar.setText("AVANÇAR");
        btAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAvancarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAvancarMouseExited(evt);
            }
        });
        btAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarActionPerformed(evt);
            }
        });

        btAvancar1.setBackground(new java.awt.Color(253, 79, 90));
        btAvancar1.setForeground(new java.awt.Color(255, 255, 255));
        btAvancar1.setText("Sair");
        btAvancar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btAvancar1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btAvancar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(189, 126, 5));
        jPanel1.setMaximumSize(new java.awt.Dimension(410, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(410, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 60));
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MineHash");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed

        System.out.println(email);
        System.out.println(senha);
        System.out.println(id);
        System.out.println(fk);

        Minerador usuario = new Minerador();
        usuario.setIdMinerador(id);
        usuario.setFkMinerador(fk);
        usuario.cadastrarComputador(email, senha, fk);


    }//GEN-LAST:event_btCadastroActionPerformed

    private void btAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarActionPerformed

        TelaProcessos telaProc = new TelaProcessos();
        telaProc.setVisible(true);


    }//GEN-LAST:event_btAvancarActionPerformed

    private void btCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastroMouseEntered
        btCadastro.setBackground(new Color(189,126,5));
    }//GEN-LAST:event_btCadastroMouseEntered

    private void btCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastroMouseExited
        btCadastro.setBackground(new Color(10, 13, 14));
    }//GEN-LAST:event_btCadastroMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       Point p = this.getLocation();
       this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void btAvancar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancar1ActionPerformed
           System.exit(0);
    }//GEN-LAST:event_btAvancar1ActionPerformed

    private void btAvancarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAvancarMouseEntered
      btAvancar.setBackground(new Color(189,126,5));
    }//GEN-LAST:event_btAvancarMouseEntered

    private void btAvancarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAvancarMouseExited
       btAvancar.setBackground(new Color(10, 13, 14));
    }//GEN-LAST:event_btAvancarMouseExited

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
            java.util.logging.Logger.getLogger(TelaCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAvancar;
    private javax.swing.JButton btAvancar1;
    private javax.swing.JButton btCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }

    public Integer getAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(Integer autenticacao) {
        this.autenticacao = autenticacao;
    }

}
