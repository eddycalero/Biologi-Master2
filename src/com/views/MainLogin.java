/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.views;

import com.controll.MainloginControll;
import java.awt.Color;


/**
 *
 * @author Eddy
 */
public class MainLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public MainLogin() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        this.setLocationRelativeTo(this);
        Inicio();
    }

    public void Inicio() {
        MainloginControll r = new MainloginControll(this);
        acceder.addActionListener(r);
        Newuser.addActionListener(r);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new com.control.Swing.TextField();
        txtPassword = new com.control.Swing.PasswordField();
        acceder = new com.control.Swing.Button();
        Newuser = new com.control.Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        iconoapp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtUser.setLabelText("Usuario");
        txtUser.setLineColor(new java.awt.Color(0, 102, 0));
        txtUser.setSelectionColor(new java.awt.Color(0, 102, 0));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtPassword.setLabelText("Contrasena");
        txtPassword.setLineColor(new java.awt.Color(0, 102, 0));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        acceder.setBackground(new java.awt.Color(255, 255, 255));
        acceder.setText("Acceder");
        acceder.setActionCommand("Acceso");
        acceder.setColor1(new java.awt.Color(68, 112, 68));
        acceder.setColor2(new java.awt.Color(43, 121, 13));
        acceder.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        acceder.setMaximumSize(new java.awt.Dimension(183, 45));
        acceder.setMinimumSize(new java.awt.Dimension(183, 45));
        acceder.setPreferredSize(new java.awt.Dimension(183, 45));

        Newuser.setBackground(new java.awt.Color(255, 255, 255));
        Newuser.setText("Nuevo Usuario");
        Newuser.setColor1(new java.awt.Color(68, 112, 68));
        Newuser.setColor2(new java.awt.Color(43, 121, 13));
        Newuser.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Newuser.setPreferredSize(new java.awt.Dimension(183, 45));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Inicio de Sesion");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/user (1).png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/llave.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iconoapp))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Newuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(acceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(iconoapp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Newuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        String Nombre = txtUser.getText();
        if (!(Nombre.length() < 17)) {
            txtUser.setText(Nombre.substring(0, 16));
            txtUser.setHelperText("El Nombre No puede tener mas de 16 Digitos");
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        String Password = txtPassword.getText();
        if (!(Password.length() < 17)) {
            txtPassword.setText(Password.substring(0, 16));
            txtPassword.setHelperText("La Contrasena No puede tener mas de 16 Digitos");
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.control.Swing.Button Newuser;
    public com.control.Swing.Button acceder;
    private javax.swing.JLabel iconoapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public com.control.Swing.PasswordField txtPassword;
    public com.control.Swing.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
