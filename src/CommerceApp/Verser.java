/*
 * la licence de ce projet est accorder 
 * a l'entreprise bbs benhaddou brother's software
 * marque deposer aupr�s des autorit�s responsable * 
 */
package CommerceApp;

import Adapters.DateAdapter;
import Adapters.FrameAdapter;
import Adapters.JDBCAdapter;
import Adapters.RecordPayment;
import com.sun.glass.events.KeyEvent;
import java.math.BigDecimal;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.FileProcess;
import util.Operation;

/**
 *
 * @author ahmed
 */
public class Verser extends javax.swing.JDialog {
    Operation operation;
    ChoiceWindow operatorChoice;
    int TAB;
    private double solde;
    /**
     * Creates new form Verser
     */
    public Verser(JFrame parent,Operation op) {
        super(parent, true);
        initComponents();
        FrameAdapter.centerFrame(this);
        setTitle(this.getTitle() + " " + op.getFrameTitleAR());
        operation = op;
        operatorChoice = new ChoiceWindow(op);
        if (op == Operation.CUSTOMER){
            operatorLabel.setText("الزبون");
            TAB = 2;
        }else if (op == Operation.PROVIDER){
            operatorLabel.setText("المزود");
            TAB = 1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        operatorTextField = new javax.swing.JTextField();
        operatorLabel = new javax.swing.JLabel();
        soldeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        versementTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obsTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("دفع");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        operatorTextField.setFont(new java.awt.Font("Simplified Arabic", 0, 12)); // NOI18N
        operatorTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        operatorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorTextFieldActionPerformed(evt);
            }
        });

        operatorLabel.setText("الزبون");

        soldeTextField.setEditable(false);
        soldeTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("قيمة القرض");

        versementTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        versementTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versementTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("المبلغ المدفوع");

        obsTextArea.setColumns(20);
        obsTextArea.setRows(5);
        obsTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                obsTextAreaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(obsTextArea);

        jLabel4.setText("ملاحظة");

        okButton.setText("نعم");
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

        noButton.setText("لا");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("الوقت");

        dateTextField.setEditable(false);
        Date today = new Date();
        String pattern = "dd/MM/YYYY--H:mm";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        String output = formatter.format(today);
        dateTextField.setText(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(versementTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(soldeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(operatorTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(operatorLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noButton)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {noButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operatorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operatorLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soldeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(versementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operatorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorTextFieldActionPerformed
        operatorChoice.show(operatorTextField.getLocationOnScreen().x,
                operatorTextField.getLocationOnScreen().y, 
                operatorTextField.getWidth(), 
                operatorTextField.getText());
    }//GEN-LAST:event_operatorTextFieldActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        ArrayList<Object> result;
        result = operatorChoice.getResult();
        if (result != null){
            operatorTextField.setText(result.get(0).toString());
            soldeTextField.setText(result.get(1).toString());
            BigDecimal bd =(BigDecimal)result.get(1);
            solde = bd.doubleValue();
            versementTextField.requestFocusInWindow();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void versementTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versementTextFieldActionPerformed
        if (versementTextField.getText()!=""){
            obsTextArea.requestFocusInWindow();
        }else{
            JOptionPane.showMessageDialog(this, "يجب عليك ملأ هذا الحقل","تحذير",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_versementTextFieldActionPerformed

    private void obsTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_obsTextAreaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            okButton.requestFocusInWindow();
        }
    }//GEN-LAST:event_obsTextAreaKeyPressed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        dispose();
    }//GEN-LAST:event_noButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        record();
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        operatorTextField.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void okButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okButtonKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            record();
            dispose();
        }
    }//GEN-LAST:event_okButtonKeyPressed

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
            java.util.logging.Logger.getLogger(Verser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Verser dialog = new Verser(new javax.swing.JFrame(),Operation.CUSTOMER);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton noButton;
    private javax.swing.JTextArea obsTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel operatorLabel;
    private javax.swing.JTextField operatorTextField;
    private javax.swing.JTextField soldeTextField;
    private javax.swing.JTextField versementTextField;
    // End of variables declaration//GEN-END:variables

    private void record() {
        RecordPayment rp=new RecordPayment( 1,   //01
                            TAB, //02
                            getNewIdVersement(), //03
                            getIdOperator(),  //04
                            DateAdapter.ConvertDateAdapter(dateTextField.getText().
                            substring(0, dateTextField.getText().indexOf('-'))),   //05 DATE
                            dateTextField.getText().
                            substring(dateTextField.getText().indexOf('-') 
                            + 2, dateTextField.getText().length()),   //06 TIME
                            "",  //07
                            "",//08
                            solde,//09
                            1,//10
                            obsTextArea.getText(), //11
                            0,     //12 
                            "PC",   //13
                            "نقدا");//14)
        rp.recordPayment();
    }
    private Object getIdOperator() {
        JDBCAdapter t = JDBCAdapter.connect();
        String sql ="SELECT id FROM " + 
                        this.operation.getTableName()
                        + " WHERE NOM ='" + operatorTextField.getText() + "'";
        t.executeQuery(sql);
        return t.getValueAt(0, 0);
    }
    private Object getNewIdVersement() {
        Object idVersement;
        JDBCAdapter verser = JDBCAdapter.connect();
        String sql_idv = "SELECT (SELECT COALESCE(MAX(IDV),0)+1  FROM VERS" 
                    + f() + ") AS IDV";
        verser.executeQuery(sql_idv);
        idVersement = verser.getValueAt(0, 0);
        return idVersement;
    }
    private String f(){
        String f="";
        if (operation.equals(Operation.CUSTOMER)){
            f = "C";
        }else if (operation.equals(Operation.PROVIDER)){
            f = "F";
        }
        return f;
    }
}
