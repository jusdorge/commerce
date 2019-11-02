/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommerceApp;

import Adapters.FrameAdapter;
import Adapters.JDBCAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.JFrame;
import util.FileProcess;
import util.Operation;
import util.Utilities;

/**
 *
 * @author DELL
 */
public class Situation extends javax.swing.JDialog {

    // Variables declaration -personnel

    private Operation operation;
    private String fileName;
    private String rFileName;
    private ChoiceWindow operatorChoice;
    private String versementType = "";
    private String operator;
    private JDBCAdapter table, table0;
    private double sommeTotal;
    private double sommeVersement;
    private String curDate;
    private JDialog parentDialog;
    /**
     * Creates new form Situation
     */
    public Situation(JFrame frm,Operation op) {
        super(frm, true);
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YY-MM-dd");
        LocalDate d = LocalDate.now();
        curDate = d.format(formater);
        switch(op){
            case CUSTOMER:
                versementType = "c";
                operator = "client";
                fileName = "vente";
                rFileName = "retv";
                break;
            case PROVIDER:
                versementType = "f";
                operator = "four";
                fileName = "achat";
                rFileName = "reta";
                break;
        }
        table = JDBCAdapter.connect();
        operatorChoice = new ChoiceWindow(op);
        operation = op;
        initComponents();
        titleLabel.setText(titleLabel.getText() + " " + op.getFrameTitle());
        setIconImage(Utilities.setIconImage(this));
        FrameAdapter.centerFrame(this);
        parentDialog = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        situationPopupMenu = new javax.swing.JPopupMenu();
        modifyMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        consultMenuItem = new javax.swing.JMenuItem();
        titleLabel = new javax.swing.JLabel();
        operatorTextField = new javax.swing.JTextField();
        customerSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        date = new datechooser.beans.DateChooserCombo();
        soldeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        oldSoldTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        modifyMenuItem.setText("Modifier");
        modifyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyMenuItemActionPerformed(evt);
            }
        });
        situationPopupMenu.add(modifyMenuItem);

        deleteMenuItem.setText("Supprimer");
        situationPopupMenu.add(deleteMenuItem);

        consultMenuItem.setText("Consulter");
        situationPopupMenu.add(consultMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        titleLabel.setBackground(new java.awt.Color(0, 0, 255));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("SITUATION");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setOpaque(true);

        operatorTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                operatorTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                operatorTextFieldKeyTyped(evt);
            }
        });

        customerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchButtonActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resultTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(resultTable);

        searchButton.setText("Recherche");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        date.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    jLabel1.setText("Nouveau Solde");

    jLabel2.setText("Acien solde");

    jLabel3.setText("Date");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(soldeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(operatorTextField)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(customerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(oldSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(31, 31, 31)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)
                    .addComponent(searchButton)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(customerSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(operatorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchButton)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(soldeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addGap(0, 38, Short.MAX_VALUE))
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {customerSearchButton, date, oldSoldTextField, operatorTextField, searchButton, soldeTextField});

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operatorTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operatorTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            showOperatorChoice();
        }
    }//GEN-LAST:event_operatorTextFieldKeyPressed

    private void operatorTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_operatorTextFieldKeyTyped
        char keyChar = evt.getKeyChar();
        if (Character.isLowerCase(keyChar)) {
            evt.setKeyChar(Character.toUpperCase(keyChar));
        }
    }//GEN-LAST:event_operatorTextFieldKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if (operatorChoice.getResult() != null){
            if (operatorChoice.getResult().size()>0){
                operatorTextField.setText((String)operatorChoice.getResult().get(0));
            }
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void customerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchButtonActionPerformed
        showOperatorChoice();
    }//GEN-LAST:event_customerSearchButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (!operatorTextField.getText().equals("")){
            table.executeQuery(getSql());
            resultTable.setModel(table);
            soldeTextField.setText(Double.toString(getSolde()));
            oldSoldTextField.setText(Double.toString(getOldSold()));
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void modifyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyMenuItemActionPerformed
        if(resultTable.getSelectedRow() >= 0){
            Operation o;
            switch (operation){
                case PROVIDER:
                    o = Operation.BUY;
                break;
                case CUSTOMER:
                    o = Operation.SELL;
                break;
                default:
                    o= Operation.SELL;
                break;
            }
            OperationWindow d = new OperationWindow(
                                parentDialog,
                                o,
                                FileProcess.MODIFY,
                                (int)resultTable.getValueAt(
                                        resultTable.getSelectedRow(),
                                        2));
            d.setVisible(true);
        }
    }//GEN-LAST:event_modifyMenuItemActionPerformed

    private void resultTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseReleased
        if(evt.isPopupTrigger()){
            situationPopupMenu.show(this, evt.getX(), evt.getYOnScreen());
        }
    }//GEN-LAST:event_resultTableMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultMenuItem;
    private javax.swing.JButton customerSearchButton;
    private datechooser.beans.DateChooserCombo date;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem modifyMenuItem;
    private javax.swing.JTextField oldSoldTextField;
    private javax.swing.JTextField operatorTextField;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton searchButton;
    private javax.swing.JPopupMenu situationPopupMenu;
    private javax.swing.JTextField soldeTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private String getSql() {
        String op, opb;
        switch (operation){
            case CUSTOMER:
                op = "VENTE";
                opb = "RETOUR VENTE";
            break;
            case PROVIDER:
                op = "ACHAT";
                opb = "RETOUR ACHAT";
            break;
            default:
                op = "";
                opb = "";
            break;
        }
        String sql1 = "(SELECT a.D as Date, a.T as Heure,"                     
                      + "a.ida as N,'"
                      + op
                      + "', a.TOTAL as Total, "
                      + "CASE WHEN a.MODE='ESPECE' THEN a.TOTAL " 
                      + "WHEN a.MODE='CREDIT' THEN 0 " 
                      + "ELSE IFNULL (b.MONT,0)  END as Versement,"
                      + "a.MODE as Mode "
                      + "FROM " + fileName + " a"
                      + " LEFT JOIN vers" + versementType + " b"
                      + " ON a.idv = b.idv"
                      + " LEFT JOIN "+ operator + " c"
                      + " ON a.id = c.id "
                      + " WHERE c.NOM ='" + getOperatorName() + "'";
        if (!Utilities.revertDate(getDate()).equals(curDate)){ 
            sql1 += " AND a.D >= '" + Utilities.revertDate(getDate()) + "'";
        }
        sql1 += ")";
        String sql2 = "(SELECT D as Date, T as Heure, idv as N,'VERSEMENT', 0 as Total,"
                      + "mont as Versement, mode as Mode "
                      + "FROM vers" + versementType + " "
                      + "LEFT JOIN " + operator + " on vers" + versementType
                      + ".id = " + operator + ".id "
                      + " WHERE NOM ='" + getOperatorName() + "'";
        if (!Utilities.revertDate(getDate()).equals(curDate)){
            sql2 += " AND D >= '" + Utilities.revertDate(getDate()) + "'";
        }
        sql2 += ")";
        String sql3 = "(SELECT a.D as Date, a.T as Heure,"                     
                      + "a.ida as N,'"
                      + opb
                      + "', a.TOTAL as Total, "
                      + "CASE WHEN a.MODE='ESPECE' THEN a.TOTAL " 
                      + "WHEN a.MODE='CREDIT' THEN 0 " 
                      + "ELSE IFNULL (b.MONT,0)  END as Versement,"
                      + "a.MODE as Mode "
                      + "FROM " + rFileName + " a"
                      + " LEFT JOIN vers" + versementType + " b"
                      + " ON a.idv = b.idv"
                      + " LEFT JOIN "+ operator + " c"
                      + " ON a.id = c.id "
                      + " WHERE c.NOM ='" + getOperatorName() + "'";
        if (!Utilities.revertDate(getDate()).equals(curDate)){ 
            sql3 += " AND a.D >= '" + Utilities.revertDate(getDate()) + "'";
        }
        sql3 += ")";
        String result = sql1 + " UNION " 
                + sql2 + " UNION " + 
                sql3 +"ORDER BY Date";
        return result;
    }

    private void showOperatorChoice() {
        operatorChoice.show(operatorTextField.getLocationOnScreen().x, 
                          operatorTextField.getLocationOnScreen().y + 
                                  operatorTextField.getHeight(),
                          400, 
                          getOperatorName());        
    }
    
    private String getOperatorName(){
        if (operatorTextField.getText().equals(null)){
            return "";
        }
        return operatorTextField.getText();
    }
    
    private double getSumTotals(){
        double result = 0.0;
        BigDecimal res;
        for (int i = 0; i < table.getRowCount(); i++){
            res = (BigDecimal)table.getValueAt(i, 4);
            result += res.doubleValue();
        }
        return result;
    }
    
    private double getSumWidthdrawls(){
        double result = 0.0;
        BigDecimal res;
        for (int i = 0; i < table.getRowCount(); i++){
            res = (BigDecimal)table.getValueAt(i, 5);
            result += res.doubleValue();
        }
        return result;
    }
    
    private double getSolde(){
        double result = 0.0;
        BigDecimal res;
        String sql = "SELECT solde2 + solde as credit FROM " + operator
                    + " WHERE nom ='" 
                    + getOperatorName() + "'";
        table0 = JDBCAdapter.connect();
        table0.executeQuery(sql);
        res = (BigDecimal)table0.getValueAt(0,0);
        result = res.doubleValue();
        return result;
    }
    
    private double getSum(){
        return getSumTotals() - getSumWidthdrawls();
    }
    
    private double getOldSold(){
        return getSum() - getSolde();
    }
    
    private String getDate(){
        return (date.getText());
    }
}
