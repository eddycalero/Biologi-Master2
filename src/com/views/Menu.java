
package com.views;

import com.controll.MenuControll;
import java.awt.Color;

/**
 *
 * @author Eddy
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        this.setLocationRelativeTo(this);
        Inicio();
    }
    
    public void Inicio(){
        MenuControll k = new MenuControll(this);
        Celula.addActionListener(k);
        Rocas.addActionListener(k);
        Moleculas.addActionListener(k);
        Atomos.addActionListener(k);
        Quiz.addActionListener(k);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Celula = new com.control.Swing.Button();
        Rocas = new com.control.Swing.Button();
        Atomos = new com.control.Swing.Button();
        Moleculas = new com.control.Swing.Button();
        Quiz = new com.control.Swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Celula.setBackground(new java.awt.Color(255, 255, 255));
        Celula.setText("Las Celulas");
        Celula.setColor1(new java.awt.Color(0, 153, 51));
        Celula.setColor2(new java.awt.Color(0, 102, 102));
        Celula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Rocas.setBackground(new java.awt.Color(255, 255, 255));
        Rocas.setText("Las Rocas");
        Rocas.setColor1(new java.awt.Color(0, 153, 51));
        Rocas.setColor2(new java.awt.Color(0, 102, 102));
        Rocas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Atomos.setBackground(new java.awt.Color(255, 255, 255));
        Atomos.setText("Atomos ");
        Atomos.setActionCommand("Los Atomos");
        Atomos.setColor1(new java.awt.Color(0, 153, 51));
        Atomos.setColor2(new java.awt.Color(0, 102, 102));
        Atomos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Moleculas.setBackground(new java.awt.Color(255, 255, 255));
        Moleculas.setText("Las Moleculas ");
        Moleculas.setActionCommand("Moleculas");
        Moleculas.setColor1(new java.awt.Color(0, 153, 51));
        Moleculas.setColor2(new java.awt.Color(0, 102, 102));
        Moleculas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Quiz.setBackground(new java.awt.Color(255, 255, 255));
        Quiz.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Quiz.setText("Prueba tus Conocimientos");
        Quiz.setColor1(new java.awt.Color(0, 153, 51));
        Quiz.setColor2(new java.awt.Color(0, 102, 102));
        Quiz.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/laboratorio.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Master Biologi");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rocas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Atomos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Celula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Moleculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Quiz, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(49, 49, 49)
                .addComponent(Celula, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rocas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Atomos, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Moleculas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quiz, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.control.Swing.Button Atomos;
    public com.control.Swing.Button Celula;
    public com.control.Swing.Button Moleculas;
    public com.control.Swing.Button Quiz;
    public com.control.Swing.Button Rocas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
