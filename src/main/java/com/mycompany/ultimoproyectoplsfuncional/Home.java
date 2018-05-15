/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ultimoproyectoplsfuncional;

import java.util.ArrayList;

/**
 *
 * @author Jcr
 */

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    Connection connection = new Connection("3l4yov6lh1qodeaesmor0220lzuxoa", "fencxs08zo08f5pl6jinswdzknqonh");
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);//centra el JFRAME
        connection.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_lateral = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textoBusqueda = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        buscarBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        btn_salida = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        numeroVistas = new javax.swing.JLabel();
        numeroStreams = new javax.swing.JLabel();
        nombreJuego = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        numeroVistas1 = new javax.swing.JLabel();
        numeroStreams1 = new javax.swing.JLabel();
        nombreJuego1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        numeroVistas2 = new javax.swing.JLabel();
        numeroStreams2 = new javax.swing.JLabel();
        nombreJuego2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        numeroVistas3 = new javax.swing.JLabel();
        numeroStreams3 = new javax.swing.JLabel();
        nombreJuego3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_lateral.setBackground(new java.awt.Color(0, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Disenado por");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Alexander Fernandez");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Kevin Martinez");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Jose Cedeno");

        textoBusqueda.setBackground(new java.awt.Color(51, 0, 204));
        textoBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        textoBusqueda.setBorder(null);
        textoBusqueda.setCaretColor(new java.awt.Color(255, 255, 255));
        textoBusqueda.setPreferredSize(new java.awt.Dimension(2, 20));
        textoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoBusquedaActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 27, 178));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TWITCH APPi");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(por juego)");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Minimo de vistas");

        jSpinner2.setModel(new javax.swing.SpinnerListModel(new String[] {"Item 0", "Item 1", "Item 2", "Item 3"}));

        buscarBtn.setBackground(new java.awt.Color(51, 0, 204));
        buscarBtn.setForeground(new java.awt.Color(51, 0, 204));
        buscarBtn.setText("B");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_lateralLayout = new javax.swing.GroupLayout(panel_lateral);
        panel_lateral.setLayout(panel_lateralLayout);
        panel_lateralLayout.setHorizontalGroup(
            panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_lateralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_lateralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panel_lateralLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))))
                    .addComponent(jLabel11)
                    .addGroup(panel_lateralLayout.createSequentialGroup()
                        .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_lateralLayout.setVerticalGroup(
            panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lateralLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(24, 24, 24)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panel_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jPanel3.setBackground(new java.awt.Color(232, 234, 246));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("LENGUAJE:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, -1, -1));

        jCheckBox1.setText("English");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jCheckBox2.setText("Espanol");
        jCheckBox2.setContentAreaFilled(false);
        jPanel3.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jCheckBox3.setText("English");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        jCheckBox4.setText("Espanol");
        jCheckBox4.setContentAreaFilled(false);
        jPanel3.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 700, 50));

        jPanel1.setBackground(new java.awt.Color(79, 0, 255));

        btn_salida.setBackground(new java.awt.Color(0, 0, 0));
        btn_salida.setText("otraI");

        jLabel7.setText("Imagen");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Token de acceso:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("XXXX-XXXX-XXXX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 700, 90));

        mainPanel.setBackground(new java.awt.Color(232, 234, 246));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 23, 68));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 267, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Juego");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, -1, 16));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(117, 117, 117));
        jLabel15.setText("Streams");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 85, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(97, 97, 97));
        jLabel16.setText("Vistas");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, -1, -1));

        numeroVistas.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroVistas.setForeground(new java.awt.Color(61, 90, 254));
        jPanel5.add(numeroVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 110, -1, -1));

        numeroStreams.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroStreams.setForeground(new java.awt.Color(61, 90, 254));
        jPanel5.add(numeroStreams, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, -1, -1));

        nombreJuego.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jPanel5.add(nombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 145, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 23, 68));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 267, -1));

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Juego");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, -1, 16));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(117, 117, 117));
        jLabel18.setText("Streams");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 85, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(97, 97, 97));
        jLabel19.setText("Vistas");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, -1, -1));

        numeroVistas1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroVistas1.setForeground(new java.awt.Color(61, 90, 254));
        jPanel7.add(numeroVistas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 110, -1, -1));

        numeroStreams1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroStreams1.setForeground(new java.awt.Color(61, 90, 254));
        jPanel7.add(numeroStreams1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, -1, -1));

        nombreJuego1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jPanel7.add(nombreJuego1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 145, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 23, 68));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 267, -1));

        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Juego");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, -1, 16));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(117, 117, 117));
        jLabel21.setText("Streams");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 85, -1, -1));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(97, 97, 97));
        jLabel22.setText("Vistas");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, -1, -1));

        numeroVistas2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroVistas2.setForeground(new java.awt.Color(61, 90, 254));
        jPanel11.add(numeroVistas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 110, -1, -1));

        numeroStreams2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroStreams2.setForeground(new java.awt.Color(61, 90, 254));
        jPanel11.add(numeroStreams2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, -1, -1));

        nombreJuego2.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jPanel11.add(nombreJuego2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 145, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 23, 68));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 267, -1));

        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Juego");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, -1, 16));

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(117, 117, 117));
        jLabel24.setText("Streams");
        jPanel13.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 85, -1, -1));

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(97, 97, 97));
        jLabel25.setText("Vistas");
        jPanel13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, -1, -1));

        numeroVistas3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroVistas3.setForeground(new java.awt.Color(61, 90, 254));
        jPanel13.add(numeroVistas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 110, -1, -1));

        numeroStreams3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroStreams3.setForeground(new java.awt.Color(61, 90, 254));
        jPanel13.add(numeroStreams3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, -1, -1));

        nombreJuego3.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jPanel13.add(nombreJuego3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 145, -1));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 670, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoBusquedaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    
    private void asignarJlabel(String name,int index,Long viewers,int streams){
        if (index == 0){ //asigno a panel 1
        nombreJuego.setText(name);
        numeroStreams.setText(String.valueOf(streams));
        numeroVistas.setText(viewers.toString());
        }
        else if (index == 1){ //asigno a panel 2
        nombreJuego1.setText(name);
        numeroStreams1.setText(String.valueOf(streams));
        numeroVistas1.setText(viewers.toString());
        }
        
        else if (index == 2){ //asigno a panel 3 
        nombreJuego2.setText(name);
        numeroStreams2.setText(String.valueOf(streams));
        numeroVistas2.setText(viewers.toString());
        }
        else if (index == 3){ //asigno a panel 3 
        nombreJuego3.setText(name);
        numeroStreams3.setText(String.valueOf(streams));
        numeroVistas3.setText(viewers.toString());
        }
    }
    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
    	GameSearch search = new GameSearch(connection);
    	StreamSearch ssearch = new StreamSearch(connection);
    	
    	String gameName = textoBusqueda.getText().toString().replace("  ", " ").replace(" ", "+");
    	ArrayList<Game> games = search.byQuery(gameName);
        ArrayList<Long> totalviewsx = new ArrayList<Long>();
        ArrayList<Integer> streamssize = new ArrayList<Integer>();

    	if(games != null) {
	    	System.out.println("Cantidad de resultados: " + games.size());
	    	for (int i = 0; i < games.size(); i++) {
	    		System.out.println("Nombre: " + games.get(i).getName());
	    		ArrayList<Stream> streams = ssearch.byGameId(games.get(i).getId());
	    		Long totalViews = new Long(0);
                        
	        	for(int j = 0; j < streams.size(); j++) {
	        		totalViews += streams.get(j).getViewers();     
	        	}
                        
                        streamssize.add(streams.size());
                        totalviewsx.add(totalViews);
                        
                        System.out.println(totalviewsx.toString());
                        asignarJlabel(games.get(i).getName(),i,totalviewsx.get(i),streamssize.get(i));
	    	}
    	}
    	else {
    		System.out.println("No se han encontrado resultados.");
    	}
    }//GEN-LAST:event_buscarBtnActionPerformed

    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_salida;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nombreJuego;
    private javax.swing.JLabel nombreJuego1;
    private javax.swing.JLabel nombreJuego2;
    private javax.swing.JLabel nombreJuego3;
    private javax.swing.JLabel numeroStreams;
    private javax.swing.JLabel numeroStreams1;
    private javax.swing.JLabel numeroStreams2;
    private javax.swing.JLabel numeroStreams3;
    private javax.swing.JLabel numeroVistas;
    private javax.swing.JLabel numeroVistas1;
    private javax.swing.JLabel numeroVistas2;
    private javax.swing.JLabel numeroVistas3;
    private javax.swing.JPanel panel_lateral;
    private javax.swing.JTextField textoBusqueda;
    // End of variables declaration//GEN-END:variables
}
