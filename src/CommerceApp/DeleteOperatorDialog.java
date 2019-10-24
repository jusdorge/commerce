/*
 * la licence de ce projet est accorder 
 * a l'entreprise bbs benhaddou brother's software
 * marque deposer aupr�s des autorit�s responsable * 
 */
package CommerceApp;

import Adapters.JDBCAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objects.Validation;
import util.FileProcess;
import util.Operation;

/**
 *
 * @author ahmed
 */
public class DeleteOperatorDialog extends OperatorDialog implements Validation{
    int idOperator;
    JDialog parentDialog;
    String query;
    /**
     * Creates new form deleteOperatorDialog
     */
    public DeleteOperatorDialog(
            JFrame parent, 
            Operation op, 
            FileProcess pr,
            int row){
        super(parent, op, pr);
        parentDialog = this;
        initComponents();
        idOperator = row;
        query = "SELECT ID, NOM , ADR, WILAYA, NRC,"
            + "NFI, NAR, TEL1, TEL2, TEL3, FAX, EMAIL, WEB,"
            + "(SOLDE2 + SOLDE) AS CREDIT, OBS FROM " + operation.getTableName()
            + " WHERE ID=" + idOperator;
        
        updateFields(getJDBCAdapter(query));
        okButton.addActionListener(new ActionHendeler());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DeleteOperatorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteOperatorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteOperatorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteOperatorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeleteOperatorDialog dialog = new DeleteOperatorDialog(
                        new javax.swing.JFrame(),
                        Operation.PROVIDER,
                        FileProcess.DELETE,
                        5);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    @Override
    public void record() {
        String sql = "DELETE FROM " + operation.getTableName()
                + " WHERE ID=" + idOperator;
        int choix = JOptionPane.showConfirmDialog(this,
                "Voulez Vous supprimer");
        if (choix == JOptionPane.YES_OPTION){
            JDBCAdapter delete = JDBCAdapter.connect();
            delete.executeUpdate(sql);
            if (delete.getUpdateError()){
                System.err.println(delete.getErrorNumber());
                System.err.println(delete.getErrorMessage());
                System.err.println(delete.getErrorCause());
                if (delete.getErrorNumber() == 1451){
                    JOptionPane.showMessageDialog(parentDialog, delete.getErrorNumber()
                        + "\n" + delete.getErrorMessage() +
                        "\n" + "suppression impossible contraintes "
                        + "existes dans les tables adjacentes");
                }else{
                    JOptionPane.showMessageDialog(parentDialog, delete.getErrorNumber()
                        + "\n" + delete.getErrorMessage() +
                        "\n" + delete.getErrorCause());
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public class ActionHendeler implements ActionListener { 

        @Override
        public void actionPerformed(ActionEvent e) {
            record();
            dispose();
        }

    }
}
