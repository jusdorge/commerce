package CommerceApp;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import Adapters.FrameAdapter;
import Adapters.JDBCAdapter;
import javax.swing.*;
import util.FileProcess;
import util.Operation;
public class Versement extends JDialog {
    private double versement = 0.0;
    private double newCredit = 0.0;
    private double total = 0.0;
    private double credit = 0.0;
    private Operation operation;
    private FileProcess process;
    private int idv;
    /**
     * Creates new form Versement
     */
    public Versement(JDialog dialog) {
        super(dialog, true);
        initComponents();
        FrameAdapter.centerFrame(this);
    }
    
    public Versement(JDialog parent, double total, double credit){
        super(parent, true);
        initComponents();
        FrameAdapter.centerFrame(this);
        this.total = total;
        this.credit = credit;
        totalTextField.setText(Double.toString(total));
        creditTextField.setText(Double.toString(credit));
    }
    
    public Versement(Operation o, FileProcess p, int id){
        initComponents();
        operation = o;
        process = p;
        idv = id;
        initFields();
    }
    /**
     * *
     */
    public double getVersement(){
        return versement;
    } 
    
    public double getNewCredit(){
        return newCredit;
    }
    
    public double getCredit(){
        return credit;
    }
    
    public double getTotal(){
        return total;
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
        jLabel2 = new javax.swing.JLabel();
        PaymentTypeCombo = new javax.swing.JComboBox<String>();
        totalTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        ancienSoldeLabel = new javax.swing.JLabel();
        creditTextField = new javax.swing.JTextField();
        paymentTextField = new javax.swing.JTextField();
        paymentLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newCreditTextField = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        annuler = new javax.swing.JButton();
        globalLabel = new javax.swing.JLabel();
        globalTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("VERSEMENT");

        jLabel2.setText("Type de reglement");


        PaymentTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESPECE", "VERSEMENT", "CREDIT" }));
        PaymentTypeCombo.setFocusCycleRoot(true);
        PaymentTypeCombo.setNextFocusableComponent(ok);
        PaymentTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentTypeComboActionPerformed(evt);
            }
        });
        PaymentTypeCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PaymentTypeComboKeyPressed(evt);
            }
        });

        totalTextField.setText("00000.00");
        totalTextField.setFocusCycleRoot(true);

        totalLabel.setText("Total");

        ancienSoldeLabel.setText("ancien solde");

        creditTextField.setText("00000.00");

        paymentTextField.setText("00000.00");
        paymentTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paymentTextFieldFocusGained(evt);
            }
        });
        paymentTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                paymentTextFieldPropertyChange(evt);
            }
        });
        paymentTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paymentTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paymentTextFieldKeyTyped(evt);
            }
        });

        paymentLabel.setText("Versement");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Nouveau solde");

        newCreditTextField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newCreditTextField.setForeground(new java.awt.Color(204, 0, 0));
        newCreditTextField.setText("00000.00");

        ok.setText("Ok");
        ok.setFocusCycleRoot(true);
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        ok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okKeyPressed(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        globalLabel.setForeground(new java.awt.Color(51, 51, 255));
        globalLabel.setText("Global");

        globalTextField.setEditable(false);
        globalTextField.setForeground(new java.awt.Color(51, 51, 255));
        globalTextField.setText("00000.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(globalLabel)
                            .addComponent(ok)
                            .addComponent(jLabel6)
                            .addComponent(ancienSoldeLabel)
                            .addComponent(jLabel2)
                            .addComponent(totalLabel)
                            .addComponent(paymentLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PaymentTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(annuler)
                            .addComponent(newCreditTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(paymentTextField)
                            .addComponent(creditTextField)
                            .addComponent(totalTextField)
                            .addComponent(globalTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {annuler, ok});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PaymentTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ancienSoldeLabel)
                    .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(globalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(globalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentLabel))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(newCreditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(annuler))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // return a result containing the payment value
        // and the new credit calculated
        exitAfterOk();
    }//GEN-LAST:event_okActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void paymentTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentTextFieldKeyTyped
        int keyChar = evt.getKeyChar();
        if (!Character.isDigit(keyChar)&&(evt.getKeyChar() == KeyEvent.VK_PERIOD)){
            evt.setKeyChar(new Character(java.awt.event.KeyEvent.CHAR_UNDEFINED));
	}
    }//GEN-LAST:event_paymentTextFieldKeyTyped

    private void paymentTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paymentTextFieldFocusGained
        paymentTextField.selectAll();
    }//GEN-LAST:event_paymentTextFieldFocusGained

    private void PaymentTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentTypeComboActionPerformed
        setPayment();
    }//GEN-LAST:event_PaymentTypeComboActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setPayment();
    }//GEN-LAST:event_formWindowOpened

    private void okKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            exitAfterOk();
        }
    }//GEN-LAST:event_okKeyPressed

    private void paymentTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymentTextFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            double d;
            try{
                double a = Double.parseDouble(totalTextField.getText());
                double b = Double.parseDouble(creditTextField.getText());
                double c = Double.parseDouble(paymentTextField.getText());
                d = a + b - c;
            }catch(java.lang.NumberFormatException e){
                double a = Double.parseDouble(totalTextField.getText());
                double b = Double.parseDouble(creditTextField.getText());
                d = a + b;
            }
            newCreditTextField.setText(Double.toString(d));
            ok.requestFocusInWindow();
        }
    }//GEN-LAST:event_paymentTextFieldKeyPressed

    private void PaymentTypeComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaymentTypeComboKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            String type = (String)PaymentTypeCombo.getSelectedItem();
            switch(type){
                case "ESPECE":
                    paymentTextField.setText(totalTextField.getText());
                    newCreditTextField.setText(creditTextField.getText());
                    ok.requestFocusInWindow();
                    break;
                case "VERSEMENT":
                    paymentTextField.setText("");
                    paymentTextField.selectAll();
                    paymentTextField.requestFocusInWindow();
                    break;
                case "CREDIT":
                    ok.requestFocusInWindow();
                    break;
            }
        
            
        }
    }//GEN-LAST:event_PaymentTypeComboKeyPressed

    private void paymentTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_paymentTextFieldPropertyChange
        if (evt.getPropertyName().equals("value")){
            double somme = Double.parseDouble(totalTextField.getText()) 
                    + Double.parseDouble(creditTextField.getText());
            globalTextField.setText(Double.toString(somme));
        }
    }//GEN-LAST:event_paymentTextFieldPropertyChange
    
    private void exitAfterOk() {
        try{
            versement = Double.parseDouble(paymentTextField.getText());
            newCredit = Double.parseDouble(newCreditTextField.getText());
        }catch(java.lang.NumberFormatException ex){
            versement = 0.0;
        }
        dispose();
    }
    private void setPayment(){
        String type = (String)PaymentTypeCombo.getSelectedItem();
        switch(type){
            case "ESPECE":
                paymentTextField.setVisible(false);
                paymentLabel.setVisible(false);
                setGlobal();
                newCreditTextField.setText(creditTextField.getText());
                break;
            case "VERSEMENT":
                paymentTextField.setVisible(true);
                paymentLabel.setVisible(true);
                setGlobal();
                break;
            case "CREDIT":
                paymentTextField.setVisible(false);
                paymentLabel.setVisible(false);
                setGlobal();
                double a = Double.parseDouble(creditTextField.getText());
                double b = Double.parseDouble(totalTextField.getText());
                double c = a + b;
                newCreditTextField.setText(Double.toString(c));
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PaymentTypeCombo;
    private javax.swing.JLabel ancienSoldeLabel;
    private javax.swing.JButton annuler;
    private javax.swing.JTextField creditTextField;
    private javax.swing.JLabel globalLabel;
    private javax.swing.JTextField globalTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField newCreditTextField;
    private javax.swing.JButton ok;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField paymentTextField;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables

    private void setGlobal() {
        double somme;
        double t = Double.parseDouble(totalTextField.getText());
        double s = Double.parseDouble(creditTextField.getText());
        somme = t + s;
        globalTextField.setText(Double.toString(somme));

    }
}
