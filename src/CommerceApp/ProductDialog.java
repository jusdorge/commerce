/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommerceApp;

import Adapters.FrameAdapter;
import Adapters.JDBCAdapter;
import com.sun.glass.events.KeyEvent;
import java.text.DecimalFormat;
import java.util.Locale;
import javafx.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.FileProcess;
import util.Operation;
import util.Utilities;

/**
 *
 * @author DELL
 */
public class ProductDialog extends javax.swing.JDialog {
    protected String process;
    private final Operation operation = Operation.PRODUCT;
    /**
     * Creates new form ProductDialog
     */
    public ProductDialog(JFrame frm) {
        super(frm, true);
        process = java.util.ResourceBundle.getBundle("MessageBundle").getString("NOUVEAU");
        initComponents();
        FrameAdapter.centerFrame(this);
        setIconImage(Utilities.setIconImage(this));
        getInputContext().selectInputMethod(new Locale("ar", "DZ"));
        fillDialog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        designation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        quantite_u = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prix_achat = new javax.swing.JTextField();
        prix_vente_d = new javax.swing.JTextField();
        prix_vente_g = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stock_mini = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tva = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        codebarre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        famille = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        titleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("MessageBundle"); // NOI18N
        titleLabel.setText(bundle.getString("PRODUIT")); // NOI18N

        numberLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        numberLabel.setForeground(new java.awt.Color(204, 0, 0));
        numberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberLabel.setText(bundle.getString("N°00000")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(numberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLabel)
                .addGap(19, 19, 19)
                .addComponent(numberLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancelButton.setText(bundle.getString("ANNULER")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText(bundle.getString("OK")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        okButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                okButtonKeyReleased(evt);
            }
        });

        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });
        designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                designationKeyTyped(evt);
            }
        });

        jLabel1.setText(bundle.getString("DÉSIGNATION")); // NOI18N

        quantite_u.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        quantite_u.setText("1");
        quantite_u.setToolTipText("");
        quantite_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantite_uActionPerformed(evt);
            }
        });

        jLabel3.setText(bundle.getString("QUANTITE UNITAIRE")); // NOI18N

        prix_achat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prix_achat.setText("0.0");
        prix_achat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prix_achatActionPerformed(evt);
            }
        });

        prix_vente_d.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prix_vente_d.setText("0.0");
        prix_vente_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prix_vente_dActionPerformed(evt);
            }
        });

        prix_vente_g.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        prix_vente_g.setText("0.0");
        prix_vente_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prix_vente_gActionPerformed(evt);
            }
        });

        jLabel4.setText(bundle.getString("PRIX ACHAT")); // NOI18N

        jLabel5.setText(bundle.getString("PRIX VENTE DETAIL")); // NOI18N

        jLabel6.setText(bundle.getString("PRIX VENTE GROS")); // NOI18N

        stock_mini.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stock_mini.setText("0");
        stock_mini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_miniActionPerformed(evt);
            }
        });

        jLabel7.setText(bundle.getString("STOCK MINIMAL")); // NOI18N

        tva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tva.setText("0");
        tva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvaActionPerformed(evt);
            }
        });

        jLabel8.setText("TVA");

        jButton4.setText(bundle.getString("CODE BAR")); // NOI18N

        codebarre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/codebar.jpg"))); // NOI18N

        jLabel9.setText(bundle.getString("FAMILLE")); // NOI18N

        famille.setText(bundle.getString("ALIMENTATION")); // NOI18N
        famille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(quantite_u, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prix_achat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prix_vente_d, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(stock_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codebarre)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(prix_vente_g, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(45, 45, 45)
                        .addComponent(famille, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(quantite_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stock_mini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prix_achat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prix_vente_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(prix_vente_g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(famille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 74, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codebarre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okButton)
                                .addGap(0, 0, 0)
                                .addComponent(cancelButton)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        okButtonPressed();
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        quantite_u.selectAll();
        quantite_u.requestFocusInWindow();
    }//GEN-LAST:event_designationActionPerformed

    private void quantite_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantite_uActionPerformed
        
        stock_mini.selectAll();
        stock_mini.requestFocusInWindow();
    }//GEN-LAST:event_quantite_uActionPerformed

    private void stock_miniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_miniActionPerformed
        prix_achat.selectAll();
        prix_achat.requestFocusInWindow();
    }//GEN-LAST:event_stock_miniActionPerformed

    private void prix_achatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prix_achatActionPerformed
        prix_vente_d.selectAll();
        prix_vente_d.requestFocusInWindow();
    }//GEN-LAST:event_prix_achatActionPerformed

    private void prix_vente_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prix_vente_dActionPerformed
        prix_vente_g.selectAll();
        prix_vente_g.requestFocusInWindow();
    }//GEN-LAST:event_prix_vente_dActionPerformed

    private void prix_vente_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prix_vente_gActionPerformed
        tva.selectAll();
        tva.requestFocusInWindow();
    }//GEN-LAST:event_prix_vente_gActionPerformed

    private void tvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvaActionPerformed
        famille.selectAll();
        famille.requestFocusInWindow();
    }//GEN-LAST:event_tvaActionPerformed

    private void okButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okButtonKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            okButtonPressed();
            dispose();
        }
    }//GEN-LAST:event_okButtonKeyReleased

    private void designationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designationKeyTyped
        char keyChar = evt.getKeyChar();
        if (Character.isLowerCase(keyChar)) {
            evt.setKeyChar(Character.toUpperCase(keyChar));
        }        
    }//GEN-LAST:event_designationKeyTyped

    private void familleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familleActionPerformed
        okButton.requestFocusInWindow();
    }//GEN-LAST:event_familleActionPerformed

    public static void main(String[] args){
        ProductDialog f = new ProductDialog(null);
        f.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel codebarre;
    protected javax.swing.JTextField designation;
    private javax.swing.JTextField famille;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    protected javax.swing.JLabel numberLabel;
    protected javax.swing.JButton okButton;
    protected javax.swing.JTextField prix_achat;
    protected javax.swing.JTextField prix_vente_d;
    protected javax.swing.JTextField prix_vente_g;
    protected javax.swing.JTextField quantite_u;
    protected javax.swing.JTextField stock_mini;
    private javax.swing.JLabel titleLabel;
    protected javax.swing.JTextField tva;
    // End of variables declaration//GEN-END:variables

    protected void fillDialog() {
        String process_ar="";
        switch (process){
            case "MODIFICATION":
                process_ar="تـغـــــيير";
            break;
            case "SUPPRIMER":
                process_ar="حــــــذف";
            break;
            case "CONSULTATION":
                process_ar="كــــــشف";
            break;
            default:
                process_ar="عربي";
            break;
        }
        titleLabel.setText(process_ar + java.util.ResourceBundle.getBundle("MessageBundle").getString(" PRODUIT"));
        numberLabel.setText(getNumber());
    }

    private String getNumber() {
        String result;
        String query = "SELECT IDP FROM " + operation.getTableName() +
                        " ORDER BY IDP DESC LIMIT 1";
        JDBCAdapter jdbc = JDBCAdapter.connect();
        jdbc.executeQuery(query);
        if (jdbc.getRowCount()>0){
        int number = (int)jdbc.getValueAt(0,0) + 1;
        DecimalFormat formatter = new DecimalFormat("N°######");
        result = formatter.format(number);
        }else{
            result="1";
        }
        return result;
    }

    private void saveNewProduct() {
        String sql = "INSERT INTO produit ";
        String columnNames = "";
        String values = "";
        columnNames = "(DESIG";
        values = "VALUES ('" + designation.getText() + "'";
        if (!quantite_u.getText().equals("")
                &&!quantite_u.getText().equals(" ")
                &&!quantite_u.getText().equals("0")){
            columnNames += ", QTU";
            values += ", " + quantite_u.getText();
        }
        if (!stock_mini.getText().equals("")
                &&!stock_mini.getText().equals(" ")
                &&!stock_mini.getText().equals("0")){
            columnNames += ", SM";
            values += ", " + stock_mini.getText();
            System.out.println(stock_mini.getText());
        }
        if (!prix_achat.getText().equals("")&&
                !prix_achat.getText().equals(" ")){
            columnNames += ", PRIXA";
            values += ", " + prix_achat.getText() ;
        }
        if (!prix_vente_d.getText().equals("")&&
                !prix_vente_d.getText().equals(" ")){
            columnNames += ", PR";
            values += ", " + prix_vente_d.getText();
        }
        if (!prix_vente_g.getText().equals("")&&
                !prix_vente_g.getText().equals(" ")){
            columnNames += ", PRIXV";
            values += ", " + prix_vente_g.getText();
        }
        if (!tva.getText().equals("")&&
                !tva.getText().equals(" ")){
            columnNames += ", TVA";
            values += ", " + tva.getText();
        }
        sql += columnNames + ") " + values + ")";
        
        JDBCAdapter jdbc = JDBCAdapter.connect();
        System.out.println(sql);
        jdbc.executeUpdate(sql);
    }

    private void okButtonPressed() {
        if (designation.getText().equals("") && 
                designation.getText().equals(" ")){
            JOptionPane.showMessageDialog(this,java.util.ResourceBundle.getBundle("MessageBundle").getString("DESIGNATION DOIT ÊTRE RENSEIGNER"));
        }else{
            // si ce produit n'existe pas enregistrer
            String sql = "SELECT * FROM produit WHERE DESIG='" + 
                            designation.getText() + "'";
            JDBCAdapter produit = JDBCAdapter.connect();
            produit.executeQuery(sql);
            if (produit.getRowCount() > 0){
                JOptionPane.showMessageDialog(this, java.util.ResourceBundle.getBundle("MessageBundle").getString("CE PRODUIT EXISTE DÈJÀ"));
            }else{
                saveNewProduct();
            }
        }
    }
}
