/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommerceApp;

import Adapters.FrameAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.FileProcess;
import util.Operation;
import util.Utilities;

/**
 *
 * @author DELL
 */
public class OperatorDialog extends javax.swing.JDialog {
    protected Operation operation;
    protected FileProcess fileProcess;
    /**
     * Creates new form NewOperatorDialog
     */
    public OperatorDialog(JFrame frm, Operation op, FileProcess fp) {
        super(frm, true);
        operation = op;
        fileProcess = fp;
        initComponents();
        titleLabel.setText(fileProcess.getProcessTitle(operation) + " " 
                                            + operation.getFrameTitle());
        FrameAdapter.centerFrame(this);
        setIconImage(Utilities.setIconImage(this));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        wilaya = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nrc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nfi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tel1 = new javax.swing.JTextField();
        tel2 = new javax.swing.JTextField();
        tel3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        web = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        obs = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        solde = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titleLabel.setBackground(new java.awt.Color(0, 0, 0));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setOpaque(true);

        jLabel1.setText("ID");

        id.setEditable(false);
        id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        id.setText("0000");
        id.setFocusable(false);

        designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                designationKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                designationKeyTyped(evt);
            }
        });

        jLabel2.setText("Designation");

        adresse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adresseKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adresseKeyTyped(evt);
            }
        });

        jLabel3.setText("Adresse");

        wilaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wilayaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wilayaKeyTyped(evt);
            }
        });

        jLabel4.setText("Wilaya");

        nrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nrcKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nrcKeyTyped(evt);
            }
        });

        jLabel5.setText("N° Registre Commerce");

        nfi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nfiKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nfiKeyTyped(evt);
            }
        });

        jLabel6.setText("N° Fiscal");

        nar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                narKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                narKeyTyped(evt);
            }
        });

        jLabel7.setText("N° Article");

        tel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tel1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tel1KeyTyped(evt);
            }
        });

        tel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tel2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tel2KeyTyped(evt);
            }
        });

        tel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tel3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tel3KeyTyped(evt);
            }
        });

        jLabel8.setText("TEL1");

        jLabel9.setText("TEL2");

        jLabel10.setText("TEL3");

        fax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                faxKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                faxKeyTyped(evt);
            }
        });

        jLabel11.setText("FAX");

        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        web.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                webKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                webKeyTyped(evt);
            }
        });

        jLabel12.setText("EMAIL");

        jLabel13.setText("WEB");

        obs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                obsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                obsKeyTyped(evt);
            }
        });

        jLabel14.setText("Observation");

        cancelButton.setText("Annuler");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        cancelButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cancelButtonKeyPressed(evt);
            }
        });

        okButton.setText("OK");
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

        jLabel15.setText("Solde");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(solde)
                                    .addComponent(tel3)
                                    .addComponent(tel2)
                                    .addComponent(tel1)
                                    .addComponent(nar)
                                    .addComponent(nrc)
                                    .addComponent(adresse, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wilaya)
                            .addComponent(designation, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(nfi)
                            .addComponent(fax)
                            .addComponent(email)
                            .addComponent(web)
                            .addComponent(obs)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(wilaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void designationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designationKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_designationKeyTyped

    private void adresseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresseKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_adresseKeyTyped

    private void wilayaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wilayaKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_wilayaKeyTyped

    private void nrcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nrcKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_nrcKeyTyped

    private void nfiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nfiKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_nfiKeyTyped

    private void narKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_narKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_narKeyTyped

    private void faxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_faxKeyTyped

    private void tel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel1KeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_tel1KeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_emailKeyTyped

    private void tel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel2KeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_tel2KeyTyped

    private void webKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_webKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_webKeyTyped

    private void tel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel3KeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_tel3KeyTyped

    private void obsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obsKeyTyped
        textFieldKeyTypedProcess(evt);
    }//GEN-LAST:event_obsKeyTyped

    private void designationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designationKeyPressed
        keyPressedProcess(designation, adresse, evt, true);
    }//GEN-LAST:event_designationKeyPressed

    private void adresseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresseKeyPressed
        keyPressedProcess(adresse ,wilaya,evt,false);
    }//GEN-LAST:event_adresseKeyPressed

    private void wilayaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wilayaKeyPressed
        keyPressedProcess(wilaya,nrc,evt,false);
    }//GEN-LAST:event_wilayaKeyPressed

    private void nrcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nrcKeyPressed
        keyPressedProcess(nrc,nfi,evt,false);
    }//GEN-LAST:event_nrcKeyPressed

    private void nfiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nfiKeyPressed
        keyPressedProcess(nfi,nar,evt, false);
    }//GEN-LAST:event_nfiKeyPressed

    private void narKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_narKeyPressed
        keyPressedProcess(nar,fax,evt, false);
    }//GEN-LAST:event_narKeyPressed

    private void faxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faxKeyPressed
        keyPressedProcess(fax,tel1,evt, false);
    }//GEN-LAST:event_faxKeyPressed

    private void tel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel1KeyPressed
        keyPressedProcess(tel1,tel2,evt, false);
    }//GEN-LAST:event_tel1KeyPressed

    private void tel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel2KeyPressed
        keyPressedProcess(tel2,tel3,evt, false);
    }//GEN-LAST:event_tel2KeyPressed

    private void tel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tel3KeyPressed
        keyPressedProcess(tel3,email,evt, false);
    }//GEN-LAST:event_tel3KeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        keyPressedProcess(email,web,evt, false);
    }//GEN-LAST:event_emailKeyPressed

    private void webKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_webKeyPressed
        keyPressedProcess(web,obs,evt, false);
    }//GEN-LAST:event_webKeyPressed

    private void obsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obsKeyPressed
        keyPressedProcess(okButton);
    }//GEN-LAST:event_obsKeyPressed

    private void cancelButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cancelButtonKeyPressed
        buttonKeyPressedProcess(okButton,evt);
    }//GEN-LAST:event_cancelButtonKeyPressed

    private void okButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okButtonKeyPressed
        buttonKeyPressedProcess(cancelButton,evt);
    }//GEN-LAST:event_okButtonKeyPressed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        okActionPerformed(evt);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField adresse;
    private javax.swing.JButton cancelButton;
    protected javax.swing.JTextField designation;
    protected javax.swing.JTextField email;
    protected javax.swing.JTextField fax;
    protected javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected javax.swing.JTextField nar;
    protected javax.swing.JTextField nfi;
    protected javax.swing.JTextField nrc;
    protected javax.swing.JTextField obs;
    protected javax.swing.JButton okButton;
    protected javax.swing.JTextField solde;
    protected javax.swing.JTextField tel1;
    protected javax.swing.JTextField tel2;
    protected javax.swing.JTextField tel3;
    protected javax.swing.JLabel titleLabel;
    protected javax.swing.JTextField web;
    protected javax.swing.JTextField wilaya;
    // End of variables declaration//GEN-END:variables

    private void textFieldKeyTypedProcess(KeyEvent evt) {
        char keyChar = evt.getKeyChar();
        if (Character.isLowerCase(keyChar)) {
            evt.setKeyChar(Character.toUpperCase(keyChar));
        }
    }

    private void keyPressedProcess(JTextField tf1, JTextField tf2, 
                                    KeyEvent e, boolean state) {
    if (e.getKeyCode() == KeyEvent.VK_ENTER){
            if ( state ){
                if (!tf1.getText().equals("")){
                    tf2.requestFocusInWindow();
                }else{
                    JOptionPane.showMessageDialog(this, "Ce champ ne doit pas être vide");
                }
            }else{
                tf2.requestFocusInWindow();
            }
        }
    }           

    private void keyPressedProcess(JButton button) {
        button.requestFocusInWindow();
    }

    private void buttonKeyPressedProcess(JButton button, KeyEvent evt) {
        int keyCode = evt.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_ENTER:
            case KeyEvent.VK_ESCAPE:
                dispose();
            break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_LEFT:
                button.requestFocusInWindow();
            break;
        }
    }

    private void okActionPerformed(ActionEvent evt) {
        record();
        dispose();
    }

    private void record() {
        
    }
}
