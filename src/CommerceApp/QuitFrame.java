/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommerceApp;

import java.awt.Component;
import java.awt.event.KeyEvent;
import util.Utilities;

/**
 *
 * @author DELL
 */
public class QuitFrame extends javax.swing.JInternalFrame {
    private int i = 1;
    /**
     * Creates new form QuitFrame
     */
    public QuitFrame() {
        initComponents();
        //setIconImage(Utilities.setIconImage(this));
        //okButton.requestFocusInWindow();
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
        okButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("Voulez vous vraiment quitter avant d'entregistrer");

        okButton.setText("Oui");
        okButton.setName("ok"); // NOI18N
        okButton.setSelected(true);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okButtonKeyPressed(evt);
            }
        });

        noButton.setText("Non");
        noButton.setName("annuler"); // NOI18N
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        noButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noButtonKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setText("Attention: : quitter cette fenêtre provoque la perte de tous information non enregistrée l'editeur ce voix dispenser de la responsabilite engendré par cette action.");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Attention");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(okButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(noButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_okButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_noButtonActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println(evt.toString());
        processKeyPressed(evt);
    }//GEN-LAST:event_formKeyPressed

    private void noButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noButtonKeyPressed
        processKeyPressed(evt);

    }//GEN-LAST:event_noButtonKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        okButton.requestFocusInWindow();
    }//GEN-LAST:event_formFocusGained

    private void okButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okButtonKeyPressed
        processKeyPressed(evt);
    }//GEN-LAST:event_okButtonKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton noButton;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private void processKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(i % 2 != 0){
                System.exit(0);
            }else{
                dispose();
            }
        }else
        if((evt.getKeyCode() == KeyEvent.VK_RIGHT)
                ||(evt.getKeyCode() == KeyEvent.VK_LEFT)){
            if (i % 2 == 0){
                okButton.requestFocusInWindow();
            }else{
                noButton.requestFocusInWindow();
            }
            i += 1;
        }else
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            dispose();
        }
    }
}
