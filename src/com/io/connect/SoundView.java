/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.io.connect;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author alsorc
 */
public class SoundView extends javax.swing.JInternalFrame implements Observer{
    
    private final String iPSensorSonido = "192.168.1.77";
    
    private static Servidor myServer;
    /**
     * Creates new form LightView
     */
    public SoundView() {
        initComponents();
        loadStates();
        Servidor s = getServidor();
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
    }
    
    public static Servidor getServidor(){
        if(myServer == null)
            myServer = new Servidor(5000);
        return myServer;
    }
    

    public void loadStates(){
        this.iconPresencia.setEnabled(false);
        this.iconAlert.setEnabled(false);
        this.btnAnalizar.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEncender = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        iconPresencia = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        iconAlert = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sound32.png"))); // NOI18N
        jLabel1.setText("Módulo de Sonido");

        btnEncender.setForeground(new java.awt.Color(0, 204, 0));
        btnEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/on.png"))); // NOI18N
        btnEncender.setText("Encender");
        btnEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/off.png"))); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        iconPresencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPresencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sound128.png"))); // NOI18N

        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        iconAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alert128.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iconAlert)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEncender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(iconPresencia)
                .addGap(229, 229, 229))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApagar, btnEncender});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(iconPresencia))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnEncender)
                        .addGap(18, 18, 18)
                        .addComponent(btnApagar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(iconAlert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAnalizar)
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApagar, btnEncender});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        this.iconPresencia.setEnabled(false);
        this.iconAlert.setEnabled(false);
        this.btnAnalizar.setEnabled(false);
        
        
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderActionPerformed
        this.iconPresencia.setEnabled(true);
        this.btnAnalizar.setEnabled(true);
    }//GEN-LAST:event_btnEncenderActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        String mensaje = "ANALIZAR";
        System.out.println("----Conectando a cliente---");
        Cliente c = new Cliente( 5000, mensaje.toUpperCase(), iPSensorSonido);
        Thread t = new Thread(c);
        t.start();
    }//GEN-LAST:event_btnAnalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEncender;
    private javax.swing.JLabel iconAlert;
    private javax.swing.JLabel iconPresencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        System.out.println((String)o1);
        switch((String)o1){
            case "ALERT":
                this.iconAlert.setEnabled(true);
                System.out.println("SONIDO DETECTADO");
                break;
            case "CALM":
                  this.iconAlert.setEnabled(false);
                  System.out.println("NO PRESENCIA");
                  break;
            default:
                System.err.println("Respuesta no válida " + (String)o1);
        }
    
    }
    
}