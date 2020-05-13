/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.io.connect;

import java.awt.Color;

/**
 *
 * @author alsorc
 */
public class Launcher extends javax.swing.JFrame {

//    String url = "/icons/background.jpg";
//    ImageIcon img;
 
    
    /**
     * Creates new form Launcher
     */
    public Launcher() {
        initComponents();
        this.jDesktopPane1.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnMainSonido = new javax.swing.JButton();
        btnMainPresencia = new javax.swing.JButton();
        btnMainLuz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(600, 720));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(450, 300));

        btnMainSonido.setBackground(new java.awt.Color(60, 163, 42));
        btnMainSonido.setForeground(new java.awt.Color(0, 0, 0));
        btnMainSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sound32.png"))); // NOI18N
        btnMainSonido.setText("Sonido");
        btnMainSonido.setToolTipText("Mostrar sensor de sonido");
        btnMainSonido.setMaximumSize(new java.awt.Dimension(132, 48));
        btnMainSonido.setMinimumSize(new java.awt.Dimension(132, 48));

        btnMainPresencia.setBackground(new java.awt.Color(51, 102, 255));
        btnMainPresencia.setForeground(new java.awt.Color(0, 0, 0));
        btnMainPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/presense32.png"))); // NOI18N
        btnMainPresencia.setText("Presencia");
        btnMainPresencia.setToolTipText("Mostrar sensor de presencia");
        btnMainPresencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainPresenciaActionPerformed(evt);
            }
        });

        btnMainLuz.setBackground(new java.awt.Color(248, 255, 123));
        btnMainLuz.setForeground(new java.awt.Color(0, 0, 0));
        btnMainLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/light32.png"))); // NOI18N
        btnMainLuz.setText("Luz");
        btnMainLuz.setToolTipText("Mostrar sensor de luz");
        btnMainLuz.setMaximumSize(new java.awt.Dimension(132, 48));
        btnMainLuz.setMinimumSize(new java.awt.Dimension(132, 48));
        btnMainLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainLuzActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Droid Sans Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(187, 0, 196));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/babies.png"))); // NOI18N
        jLabel1.setText("BIENVENIDO A LOS CUNEROS ");

        jDesktopPane1.setLayer(btnMainSonido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnMainPresencia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnMainLuz, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnMainSonido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMainPresencia)
                .addGap(85, 85, 85))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnMainLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
                .addContainerGap())
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMainLuz, btnMainPresencia, btnMainSonido});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnMainLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMainPresencia)
                    .addComponent(btnMainSonido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainLuzActionPerformed
        LightView lv = new LightView();
        jDesktopPane1.add(lv);
        lv.setVisible(true);
    }//GEN-LAST:event_btnMainLuzActionPerformed

    private void btnMainPresenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainPresenciaActionPerformed
        PresenceView pv = new PresenceView();
        jDesktopPane1.add(pv);
        pv.setVisible(true);
    }//GEN-LAST:event_btnMainPresenciaActionPerformed

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
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Launcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainLuz;
    private javax.swing.JButton btnMainPresencia;
    private javax.swing.JButton btnMainSonido;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
