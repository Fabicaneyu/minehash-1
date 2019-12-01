/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minehash.telas;

import com.minehash.monitoramento.Processos;
import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class TelaProcessos extends javax.swing.JFrame {

    Processos processos = new Processos();

    int idSwing[] = new int[20];
    String nomeSwing[] = new String[20];
    int prioridadeSwing[] = new int[20];

    //    int[] idProcesso = new int[10];
//    String[] nomeProcesso = new String[10];
//    int[] prioridadeProcesso = new int[10];
    /**
     * Creates new form TelaTabela
     */
    public TelaProcessos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jFrame1 = new javax.swing.JFrame();
        lbNome4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMonitorar = new javax.swing.JButton();
        btMatarProcesso = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        PID = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbPrioridade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        PID1 = new javax.swing.JLabel();
        lbNome1 = new javax.swing.JLabel();
        lbPrioridade1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        PID2 = new javax.swing.JLabel();
        lbNome2 = new javax.swing.JLabel();
        lbPrioridade2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        PID3 = new javax.swing.JLabel();
        lbNome3 = new javax.swing.JLabel();
        lbPrioridade3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbNome5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PID5 = new javax.swing.JLabel();
        lbPrioridade5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbNome6 = new javax.swing.JLabel();
        lbPrioridade6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        PID6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbNome7 = new javax.swing.JLabel();
        lbPrioridade7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        PID7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        PID8 = new javax.swing.JLabel();
        lbNome8 = new javax.swing.JLabel();
        lbPrioridade8 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbNome10 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbPrioridade10 = new javax.swing.JLabel();
        PID10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbNome9 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lbPrioridade9 = new javax.swing.JLabel();
        PID9 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        PID11 = new javax.swing.JLabel();
        lbNome11 = new javax.swing.JLabel();
        lbPrioridade11 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        PID12 = new javax.swing.JLabel();
        lbNome12 = new javax.swing.JLabel();
        lbPrioridade12 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        PID13 = new javax.swing.JLabel();
        lbNome13 = new javax.swing.JLabel();
        lbPrioridade13 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        PID14 = new javax.swing.JLabel();
        lbNome14 = new javax.swing.JLabel();
        lbPrioridade14 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        PID15 = new javax.swing.JLabel();
        lbNome15 = new javax.swing.JLabel();
        lbPrioridade15 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        PID16 = new javax.swing.JLabel();
        lbNome16 = new javax.swing.JLabel();
        lbPrioridade16 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        PID17 = new javax.swing.JLabel();
        lbNome17 = new javax.swing.JLabel();
        lbPrioridade17 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        PID18 = new javax.swing.JLabel();
        lbNome18 = new javax.swing.JLabel();
        lbPrioridade18 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        PID19 = new javax.swing.JLabel();
        lbNome19 = new javax.swing.JLabel();
        lbPrioridade19 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        PID20 = new javax.swing.JLabel();
        lbNome20 = new javax.swing.JLabel();
        lbPrioridade20 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 534, 48, -1));

        jPanel1.setBackground(new java.awt.Color(216, 166, 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 77));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1840, -1));

        jPanel2.setBackground(new java.awt.Color(18, 18, 18));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnMonitorar.setBackground(new java.awt.Color(10, 13, 14));
        btnMonitorar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMonitorar.setForeground(new java.awt.Color(255, 255, 255));
        btnMonitorar.setText("Monitorar");
        btnMonitorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMonitorarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMonitorarMouseExited(evt);
            }
        });
        btnMonitorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorarActionPerformed(evt);
            }
        });

        btMatarProcesso.setBackground(new java.awt.Color(10, 13, 14));
        btMatarProcesso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btMatarProcesso.setForeground(new java.awt.Color(255, 255, 255));
        btMatarProcesso.setText("encerrar Processo");
        btMatarProcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMatarProcessoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMatarProcessoMouseExited(evt);
            }
        });
        btMatarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMatarProcessoActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(96, 94, 94));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel3.setPreferredSize(new java.awt.Dimension(321, 103));

        PID.setBackground(new java.awt.Color(181, 185, 190));
        PID.setText("  ");
        PID.setToolTipText("");
        PID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID.setDoubleBuffered(true);
        PID.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID.setOpaque(true);

        lbNome.setBackground(new java.awt.Color(181, 185, 190));
        lbNome.setText("  ");
        lbNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome.setOpaque(true);

        lbPrioridade.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade.setText("  ");
        lbPrioridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade.setOpaque(true);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PID");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRIORIDADE");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PID)
                    .addComponent(jLabel4)
                    .addComponent(lbPrioridade))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(96, 94, 94));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel5.setPreferredSize(new java.awt.Dimension(321, 103));

        PID1.setBackground(new java.awt.Color(181, 185, 190));
        PID1.setText("  ");
        PID1.setToolTipText("");
        PID1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID1.setDoubleBuffered(true);
        PID1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID1.setOpaque(true);

        lbNome1.setBackground(new java.awt.Color(181, 185, 190));
        lbNome1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome1.setText("  ");
        lbNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome1.setOpaque(true);

        lbPrioridade1.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade1.setText("  ");
        lbPrioridade1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade1.setOpaque(true);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PID");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PRIORIDADE");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NOME");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(PID1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPrioridade1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lbNome1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PID1)
                    .addComponent(jLabel11)
                    .addComponent(lbPrioridade1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(96, 94, 94));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel6.setPreferredSize(new java.awt.Dimension(321, 103));

        PID2.setBackground(new java.awt.Color(181, 185, 190));
        PID2.setText("  ");
        PID2.setToolTipText("");
        PID2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID2.setDoubleBuffered(true);
        PID2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID2.setOpaque(true);

        lbNome2.setBackground(new java.awt.Color(181, 185, 190));
        lbNome2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome2.setText("  ");
        lbNome2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome2.setOpaque(true);

        lbPrioridade2.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade2.setText("  ");
        lbPrioridade2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade2.setOpaque(true);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PID");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRIORIDADE");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOME");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(PID2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbNome2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(PID2)
                    .addComponent(jLabel14)
                    .addComponent(lbPrioridade2))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(96, 94, 94));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel7.setPreferredSize(new java.awt.Dimension(321, 103));

        PID3.setBackground(new java.awt.Color(181, 185, 190));
        PID3.setText("  ");
        PID3.setToolTipText("");
        PID3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID3.setDoubleBuffered(true);
        PID3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID3.setOpaque(true);

        lbNome3.setBackground(new java.awt.Color(181, 185, 190));
        lbNome3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome3.setText("  ");
        lbNome3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome3.setOpaque(true);

        lbPrioridade3.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade3.setText("  ");
        lbPrioridade3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade3.setOpaque(true);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PID");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("PRIORIDADE");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("NOME");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(PID3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lbNome3))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(PID3)
                    .addComponent(jLabel17)
                    .addComponent(lbPrioridade3))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(96, 94, 94));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel8.setPreferredSize(new java.awt.Dimension(321, 103));
        jPanel8.setRequestFocusEnabled(false);
        jPanel8.setVerifyInputWhenFocusTarget(false);

        lbNome5.setBackground(new java.awt.Color(181, 185, 190));
        lbNome5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome5.setText("  ");
        lbNome5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome5.setOpaque(true);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("PID");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("PRIORIDADE");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("NOME");

        PID5.setBackground(new java.awt.Color(181, 185, 190));
        PID5.setText("  ");
        PID5.setToolTipText("");
        PID5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID5.setDoubleBuffered(true);
        PID5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID5.setOpaque(true);

        lbPrioridade5.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade5.setText("  ");
        lbPrioridade5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade5.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbNome5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(PID5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lbNome5))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(PID5)
                    .addComponent(lbPrioridade5))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(96, 94, 94));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel9.setPreferredSize(new java.awt.Dimension(321, 103));

        lbNome6.setBackground(new java.awt.Color(181, 185, 190));
        lbNome6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome6.setText("  ");
        lbNome6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome6.setOpaque(true);

        lbPrioridade6.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade6.setText("  ");
        lbPrioridade6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade6.setOpaque(true);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("PID");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PRIORIDADE");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("NOME");

        PID6.setBackground(new java.awt.Color(181, 185, 190));
        PID6.setText("  ");
        PID6.setToolTipText("");
        PID6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID6.setDoubleBuffered(true);
        PID6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID6.setOpaque(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbNome6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(PID6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lbNome6))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(lbPrioridade6)
                    .addComponent(PID6))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(96, 94, 94));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel11.setPreferredSize(new java.awt.Dimension(321, 103));

        lbNome7.setBackground(new java.awt.Color(181, 185, 190));
        lbNome7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome7.setText("  ");
        lbNome7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome7.setOpaque(true);

        lbPrioridade7.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade7.setText("  ");
        lbPrioridade7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade7.setOpaque(true);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("PID");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("PRIORIDADE");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("NOME");

        PID7.setBackground(new java.awt.Color(181, 185, 190));
        PID7.setText("  ");
        PID7.setToolTipText("");
        PID7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID7.setDoubleBuffered(true);
        PID7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID7.setOpaque(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(PID7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lbNome7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lbNome7))
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(lbPrioridade7)
                    .addComponent(PID7))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(96, 94, 94));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel12.setPreferredSize(new java.awt.Dimension(321, 103));

        PID8.setBackground(new java.awt.Color(181, 185, 190));
        PID8.setText("  ");
        PID8.setToolTipText("");
        PID8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID8.setDoubleBuffered(true);
        PID8.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID8.setOpaque(true);

        lbNome8.setBackground(new java.awt.Color(181, 185, 190));
        lbNome8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome8.setText("  ");
        lbNome8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome8.setOpaque(true);

        lbPrioridade8.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade8.setText("  ");
        lbPrioridade8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade8.setOpaque(true);

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("PID");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("PRIORIDADE");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("NOME");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lbNome8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(PID8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(lbNome8))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(PID8)
                    .addComponent(jLabel32)
                    .addComponent(lbPrioridade8))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(96, 94, 94));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel13.setPreferredSize(new java.awt.Dimension(321, 103));

        lbNome10.setBackground(new java.awt.Color(181, 185, 190));
        lbNome10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome10.setText("  ");
        lbNome10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome10.setOpaque(true);

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("PID");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("PRIORIDADE");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("NOME");

        lbPrioridade10.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade10.setText("  ");
        lbPrioridade10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade10.setOpaque(true);

        PID10.setBackground(new java.awt.Color(181, 185, 190));
        PID10.setText("  ");
        PID10.setToolTipText("");
        PID10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID10.setDoubleBuffered(true);
        PID10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID10.setOpaque(true);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(PID10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPrioridade10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(lbNome10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(lbNome10))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(lbPrioridade10)
                    .addComponent(PID10))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(96, 94, 94));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel14.setPreferredSize(new java.awt.Dimension(321, 103));

        lbNome9.setBackground(new java.awt.Color(181, 185, 190));
        lbNome9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome9.setText("  ");
        lbNome9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome9.setOpaque(true);

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("PID");

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("PRIORIDADE");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("NOME");

        lbPrioridade9.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade9.setText("  ");
        lbPrioridade9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade9.setOpaque(true);

        PID9.setBackground(new java.awt.Color(181, 185, 190));
        PID9.setText("  ");
        PID9.setToolTipText("");
        PID9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID9.setDoubleBuffered(true);
        PID9.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID9.setOpaque(true);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(PID9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 36, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(lbNome9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lbNome9))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(lbPrioridade9)
                    .addComponent(PID9))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(96, 94, 94));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel15.setPreferredSize(new java.awt.Dimension(321, 103));

        PID11.setBackground(new java.awt.Color(181, 185, 190));
        PID11.setText("  ");
        PID11.setToolTipText("");
        PID11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID11.setDoubleBuffered(true);
        PID11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID11.setOpaque(true);

        lbNome11.setBackground(new java.awt.Color(181, 185, 190));
        lbNome11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome11.setText("  ");
        lbNome11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome11.setOpaque(true);

        lbPrioridade11.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade11.setText("  ");
        lbPrioridade11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade11.setOpaque(true);

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("PID");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("PRIORIDADE");

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("NOME");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(PID11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lbNome11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(lbNome11))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(PID11)
                    .addComponent(jLabel41)
                    .addComponent(lbPrioridade11))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(96, 94, 94));
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel16.setPreferredSize(new java.awt.Dimension(321, 103));

        PID12.setBackground(new java.awt.Color(181, 185, 190));
        PID12.setText("  ");
        PID12.setToolTipText("");
        PID12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID12.setDoubleBuffered(true);
        PID12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID12.setOpaque(true);

        lbNome12.setBackground(new java.awt.Color(181, 185, 190));
        lbNome12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome12.setText("  ");
        lbNome12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome12.setOpaque(true);

        lbPrioridade12.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade12.setText("  ");
        lbPrioridade12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade12.setOpaque(true);

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("PID");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("PRIORIDADE");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("NOME");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(lbNome12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(PID12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lbNome12))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(PID12)
                    .addComponent(jLabel44)
                    .addComponent(lbPrioridade12))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(96, 94, 94));
        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel17.setPreferredSize(new java.awt.Dimension(321, 103));

        PID13.setBackground(new java.awt.Color(181, 185, 190));
        PID13.setText("  ");
        PID13.setToolTipText("");
        PID13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID13.setDoubleBuffered(true);
        PID13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID13.setOpaque(true);

        lbNome13.setBackground(new java.awt.Color(181, 185, 190));
        lbNome13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome13.setText("  ");
        lbNome13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome13.setOpaque(true);

        lbPrioridade13.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade13.setText("  ");
        lbPrioridade13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade13.setOpaque(true);

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("PID");

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("PRIORIDADE");

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("NOME");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(lbNome13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(PID13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(lbNome13))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(PID13)
                    .addComponent(jLabel47)
                    .addComponent(lbPrioridade13))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(96, 94, 94));
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel18.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel18.setPreferredSize(new java.awt.Dimension(321, 103));

        PID14.setBackground(new java.awt.Color(181, 185, 190));
        PID14.setText("  ");
        PID14.setToolTipText("");
        PID14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID14.setDoubleBuffered(true);
        PID14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID14.setOpaque(true);

        lbNome14.setBackground(new java.awt.Color(181, 185, 190));
        lbNome14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome14.setText("  ");
        lbNome14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome14.setOpaque(true);

        lbPrioridade14.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade14.setText("  ");
        lbPrioridade14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade14.setOpaque(true);

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("PID");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("PRIORIDADE");

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("NOME");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lbNome14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(PID14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(lbNome14))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(PID14)
                    .addComponent(jLabel50)
                    .addComponent(lbPrioridade14))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(96, 94, 94));
        jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel19.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel19.setPreferredSize(new java.awt.Dimension(321, 103));

        PID15.setBackground(new java.awt.Color(181, 185, 190));
        PID15.setText("  ");
        PID15.setToolTipText("");
        PID15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID15.setDoubleBuffered(true);
        PID15.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID15.setOpaque(true);

        lbNome15.setBackground(new java.awt.Color(181, 185, 190));
        lbNome15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome15.setText("  ");
        lbNome15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome15.setOpaque(true);

        lbPrioridade15.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade15.setText("  ");
        lbPrioridade15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade15.setOpaque(true);

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("PID");

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("PRIORIDADE");

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("NOME");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(lbNome15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(PID15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(lbNome15))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(PID15)
                    .addComponent(jLabel53)
                    .addComponent(lbPrioridade15))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(96, 94, 94));
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel20.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel20.setPreferredSize(new java.awt.Dimension(321, 103));

        PID16.setBackground(new java.awt.Color(181, 185, 190));
        PID16.setText("  ");
        PID16.setToolTipText("");
        PID16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID16.setDoubleBuffered(true);
        PID16.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID16.setOpaque(true);

        lbNome16.setBackground(new java.awt.Color(181, 185, 190));
        lbNome16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome16.setText("  ");
        lbNome16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome16.setOpaque(true);

        lbPrioridade16.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade16.setText("  ");
        lbPrioridade16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade16.setOpaque(true);

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("PID");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("PRIORIDADE");

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("NOME");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(lbNome16, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(PID16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(lbNome16))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(PID16)
                    .addComponent(jLabel56)
                    .addComponent(lbPrioridade16))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(96, 94, 94));
        jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel21.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel21.setPreferredSize(new java.awt.Dimension(321, 103));

        PID17.setBackground(new java.awt.Color(181, 185, 190));
        PID17.setText("  ");
        PID17.setToolTipText("");
        PID17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID17.setDoubleBuffered(true);
        PID17.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID17.setOpaque(true);

        lbNome17.setBackground(new java.awt.Color(181, 185, 190));
        lbNome17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome17.setText("  ");
        lbNome17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome17.setOpaque(true);

        lbPrioridade17.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade17.setText("  ");
        lbPrioridade17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade17.setOpaque(true);

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("PID");

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("PRIORIDADE");

        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("NOME");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(lbNome17, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(PID17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel59)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(lbNome17))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(PID17)
                    .addComponent(jLabel59)
                    .addComponent(lbPrioridade17))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(96, 94, 94));
        jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel22.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel22.setPreferredSize(new java.awt.Dimension(321, 103));

        PID18.setBackground(new java.awt.Color(181, 185, 190));
        PID18.setText("  ");
        PID18.setToolTipText("");
        PID18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID18.setDoubleBuffered(true);
        PID18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID18.setOpaque(true);

        lbNome18.setBackground(new java.awt.Color(181, 185, 190));
        lbNome18.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome18.setText("  ");
        lbNome18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome18.setOpaque(true);

        lbPrioridade18.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade18.setText("  ");
        lbPrioridade18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade18.setOpaque(true);

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("PID");

        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("PRIORIDADE");

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("NOME");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(lbNome18, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(PID18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(lbNome18))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(PID18)
                    .addComponent(jLabel62)
                    .addComponent(lbPrioridade18))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(96, 94, 94));
        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel23.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel23.setPreferredSize(new java.awt.Dimension(321, 103));

        PID19.setBackground(new java.awt.Color(181, 185, 190));
        PID19.setText("  ");
        PID19.setToolTipText("");
        PID19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID19.setDoubleBuffered(true);
        PID19.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID19.setOpaque(true);

        lbNome19.setBackground(new java.awt.Color(181, 185, 190));
        lbNome19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome19.setText("  ");
        lbNome19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome19.setOpaque(true);

        lbPrioridade19.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade19.setText("  ");
        lbPrioridade19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade19.setOpaque(true);

        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("PID");

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("PRIORIDADE");

        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("NOME");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(lbNome19, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(PID19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel65)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(lbNome19))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(PID19)
                    .addComponent(jLabel65)
                    .addComponent(lbPrioridade19))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(96, 94, 94));
        jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel24.setMaximumSize(new java.awt.Dimension(321, 103));
        jPanel24.setPreferredSize(new java.awt.Dimension(321, 103));

        PID20.setBackground(new java.awt.Color(181, 185, 190));
        PID20.setText("  ");
        PID20.setToolTipText("");
        PID20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID20.setDoubleBuffered(true);
        PID20.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        PID20.setOpaque(true);

        lbNome20.setBackground(new java.awt.Color(181, 185, 190));
        lbNome20.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbNome20.setText("  ");
        lbNome20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome20.setOpaque(true);

        lbPrioridade20.setBackground(new java.awt.Color(181, 185, 190));
        lbPrioridade20.setText("  ");
        lbPrioridade20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade20.setOpaque(true);

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("PID");

        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("PRIORIDADE");

        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("NOME");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lbNome20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(PID20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel68)
                        .addGap(18, 18, 18)
                        .addComponent(lbPrioridade20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(lbNome20))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(PID20)
                    .addComponent(jLabel68)
                    .addComponent(lbPrioridade20))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel12, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel16, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel20, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel15, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel19, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel23, 320, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMonitorar, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMatarProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMonitorar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btMatarProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 1850, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btMatarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMatarProcessoActionPerformed
        // TODO add your handling code here:

        String matarProc = jTextField1.getText();
//        processos.matarProcesso(matarProc + ".exe");

    }//GEN-LAST:event_btMatarProcessoActionPerformed

    private void btMatarProcessoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMatarProcessoMouseExited
        btMatarProcesso.setBackground(new Color(10,13,14));
        btMatarProcesso.setForeground(Color.white);
    }//GEN-LAST:event_btMatarProcessoMouseExited

    private void btMatarProcessoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMatarProcessoMouseEntered
        btMatarProcesso.setBackground(new Color(216,166,2));
        btMatarProcesso.setForeground(Color.WHITE);
    }//GEN-LAST:event_btMatarProcessoMouseEntered

    private void btnMonitorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorarActionPerformed

        processos.enviarProcessosSwing(idSwing, nomeSwing, prioridadeSwing);

     PID.setText(String.valueOf(idSwing[1]));
     lbNome.setText(nomeSwing[1]);
     lbPrioridade.setText(String.valueOf(prioridadeSwing[1]));

     PID1.setText(String.valueOf(idSwing[2]));
     lbNome1.setText(nomeSwing[2].toString());
     lbPrioridade1.setText(String.valueOf(prioridadeSwing[2]));

     PID2.setText(String.valueOf(idSwing[3]));
     lbNome2.setText(nomeSwing[3].toString());
     lbPrioridade2.setText(String.valueOf(prioridadeSwing[3]));

     PID3.setText(String.valueOf(idSwing[4]));
     lbNome3.setText(nomeSwing[4].toString());
     lbPrioridade3.setText(String.valueOf(prioridadeSwing[4]));

     PID5.setText(String.valueOf(idSwing[5]));
     lbNome5.setText(nomeSwing[5].toString());
     lbPrioridade5.setText(String.valueOf(prioridadeSwing[5]));

     PID6.setText(String.valueOf(idSwing[6]));
     lbNome6.setText(nomeSwing[6].toString());
     lbPrioridade6.setText(String.valueOf(prioridadeSwing[6]));

     PID7.setText(String.valueOf(idSwing[7]));
     lbNome7.setText(nomeSwing[7].toString());
     lbPrioridade7.setText(String.valueOf(prioridadeSwing[7]));

     PID8.setText(String.valueOf(idSwing[8]));
     lbNome8.setText(nomeSwing[8].toString());
     lbPrioridade8.setText(String.valueOf(prioridadeSwing[8]));

     PID9.setText(String.valueOf(idSwing[9]));
     lbNome9.setText(nomeSwing[9].toString());
     lbPrioridade9.setText(String.valueOf(prioridadeSwing[9]));

     PID10.setText(String.valueOf(idSwing[10]));
     lbNome10.setText(nomeSwing[10].toString());
     lbPrioridade10.setText(String.valueOf(prioridadeSwing[10]));

     PID11.setText(String.valueOf(idSwing[11]));
     lbNome11.setText(nomeSwing[11].toString());
     lbPrioridade11.setText(String.valueOf(prioridadeSwing[11]));

     PID12.setText(String.valueOf(idSwing[12]));
     lbNome12.setText(nomeSwing[12].toString());
     lbPrioridade12.setText(String.valueOf(prioridadeSwing[12]));

     PID13.setText(String.valueOf(idSwing[13]));
     lbNome13.setText(nomeSwing[13].toString());
     lbPrioridade13.setText(String.valueOf(prioridadeSwing[13]));

     PID15.setText(String.valueOf(idSwing[15]));
     lbNome14.setText(nomeSwing[15].toString());
     lbPrioridade15.setText(String.valueOf(prioridadeSwing[15]));

     PID16.setText(String.valueOf(idSwing[16]));
     lbNome15.setText(nomeSwing[16].toString());
     lbPrioridade16.setText(String.valueOf(prioridadeSwing[16]));

     PID17.setText(String.valueOf(idSwing[17]));
     lbNome16.setText(nomeSwing[17].toString());
     lbPrioridade17.setText(String.valueOf(prioridadeSwing[17]));

     PID18.setText(String.valueOf(idSwing[18]));
     lbNome17.setText(nomeSwing[18].toString());
     lbPrioridade18.setText(String.valueOf(prioridadeSwing[18]));

     PID19.setText(String.valueOf(idSwing[19]));
     lbNome18.setText(nomeSwing[19].toString());
     lbPrioridade19.setText(String.valueOf(prioridadeSwing[19]));

     PID20.setText(String.valueOf(idSwing[20]));
     lbNome19.setText(nomeSwing[20].toString());
     lbPrioridade20.setText(String.valueOf(prioridadeSwing[20]));


        

    }//GEN-LAST:event_btnMonitorarActionPerformed

    private void btnMonitorarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonitorarMouseExited
        btnMonitorar.setBackground(new Color(10,13,14));
        btnMonitorar.setForeground(Color.white);
    }//GEN-LAST:event_btnMonitorarMouseExited

    private void btnMonitorarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonitorarMouseEntered
        btnMonitorar.setBackground(new Color(216,166,2));
        btnMonitorar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMonitorarMouseEntered

    
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
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProcessos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PID;
    private javax.swing.JLabel PID1;
    private javax.swing.JLabel PID10;
    private javax.swing.JLabel PID11;
    private javax.swing.JLabel PID12;
    private javax.swing.JLabel PID13;
    private javax.swing.JLabel PID14;
    private javax.swing.JLabel PID15;
    private javax.swing.JLabel PID16;
    private javax.swing.JLabel PID17;
    private javax.swing.JLabel PID18;
    private javax.swing.JLabel PID19;
    private javax.swing.JLabel PID2;
    private javax.swing.JLabel PID20;
    private javax.swing.JLabel PID3;
    private javax.swing.JLabel PID5;
    private javax.swing.JLabel PID6;
    private javax.swing.JLabel PID7;
    private javax.swing.JLabel PID8;
    private javax.swing.JLabel PID9;
    private javax.swing.JButton btMatarProcesso;
    private javax.swing.JButton btnMonitorar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbNome10;
    private javax.swing.JLabel lbNome11;
    private javax.swing.JLabel lbNome12;
    private javax.swing.JLabel lbNome13;
    private javax.swing.JLabel lbNome14;
    private javax.swing.JLabel lbNome15;
    private javax.swing.JLabel lbNome16;
    private javax.swing.JLabel lbNome17;
    private javax.swing.JLabel lbNome18;
    private javax.swing.JLabel lbNome19;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbNome20;
    private javax.swing.JLabel lbNome3;
    private javax.swing.JLabel lbNome4;
    private javax.swing.JLabel lbNome5;
    private javax.swing.JLabel lbNome6;
    private javax.swing.JLabel lbNome7;
    private javax.swing.JLabel lbNome8;
    private javax.swing.JLabel lbNome9;
    private javax.swing.JLabel lbPrioridade;
    private javax.swing.JLabel lbPrioridade1;
    private javax.swing.JLabel lbPrioridade10;
    private javax.swing.JLabel lbPrioridade11;
    private javax.swing.JLabel lbPrioridade12;
    private javax.swing.JLabel lbPrioridade13;
    private javax.swing.JLabel lbPrioridade14;
    private javax.swing.JLabel lbPrioridade15;
    private javax.swing.JLabel lbPrioridade16;
    private javax.swing.JLabel lbPrioridade17;
    private javax.swing.JLabel lbPrioridade18;
    private javax.swing.JLabel lbPrioridade19;
    private javax.swing.JLabel lbPrioridade2;
    private javax.swing.JLabel lbPrioridade20;
    private javax.swing.JLabel lbPrioridade3;
    private javax.swing.JLabel lbPrioridade5;
    private javax.swing.JLabel lbPrioridade6;
    private javax.swing.JLabel lbPrioridade7;
    private javax.swing.JLabel lbPrioridade8;
    private javax.swing.JLabel lbPrioridade9;
    // End of variables declaration//GEN-END:variables
}
