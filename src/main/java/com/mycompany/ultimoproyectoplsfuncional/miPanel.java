/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ultimoproyectoplsfuncional;

/**
 *
 * @author Jcr
 */
public class miPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public miPanel() {
        initComponents();
    }
    
    public miPanel(String nombrejuegoX) {
        initComponents();
        nombreJuego.setText(nombrejuegoX);
        nombreJuego.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        numeroVistas = new javax.swing.JLabel();
        numeroStreams = new javax.swing.JLabel();
        nombreJuego = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        numeroVistas.setText("57");
        jPanel5.add(numeroVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 110, -1, -1));

        numeroStreams.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        numeroStreams.setForeground(new java.awt.Color(61, 90, 254));
        numeroStreams.setText("57");
        jPanel5.add(numeroStreams, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 110, -1, -1));

        nombreJuego.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        nombreJuego.setText("League of Legends");
        jPanel5.add(nombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 145, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 160));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel nombreJuego;
    private javax.swing.JLabel numeroStreams;
    private javax.swing.JLabel numeroVistas;
    // End of variables declaration//GEN-END:variables
}