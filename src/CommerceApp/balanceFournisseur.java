package CommerceApp;
import Adapters.JDBCAdapter;
import java.awt.AWTEvent;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import objects.BalanceItem;
import objects.BalanceTableModel;
import objects.DoubleRenderer;
import util.Operation;
import util.Utilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class balanceFournisseur extends javax.swing.JFrame {

    private final ChoiceWindow clientChoice;
    String searchString;
    private String venteSQL = "SELECT p.DESIG,SUM(l.QTEA) ,l.QTUA"
            + " FROM lvente l inner join "
            + "(vente v,client c,produit p) on (l.IDA=v.IDA AND"
            + " l.IDP=p.IDP AND  v.ID=c.ID) "
            + "where p.DESIG =  ";
    private String achatSQL = "SELECT p.DESIG,"
            + "SUM(l.QTEA) as QTE,l.QTUA, p.STOCK"
            + " FROM lachat l inner join (achat a,four f,produit p) "
            + "on (a.IDA=l.IDA AND a.ID=f.ID AND l.IDP=p.IDP) "
            + "WHERE f.NOM = ";
    private JDBCAdapter dataTable;
    private JDBCAdapter dataTable2;
    private BalanceTableModel model = new BalanceTableModel();

    /**
     * Creates new form balanceFournisseur
     */
    public balanceFournisseur() {
        initComponents();
        clientChoice = new ChoiceWindow(Operation.PROVIDER);
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
        fournisseurTextField = new javax.swing.JTextField();
        fourniseurSearchButton = new javax.swing.JButton();
        dateDebut = new datechooser.beans.DateChooserCombo();
        dateFin = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        achatTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        venteTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        customerSoldeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rechercherButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nombreEnregistrementTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Balance des ventes par fournisseur");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 500));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BALANCE FOURNISSEUR");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 473, 51));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("DIFFERENCE");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 330, 52));

        fournisseurTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fournisseurTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fournisseurTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fournisseurTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(fournisseurTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 30));

        fourniseurSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourniseurSearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(fourniseurSearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 30));

        dateDebut.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
    dateDebut.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
    dateDebut.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);
    dateDebut.setShowOneMonth(true);
    getContentPane().add(dateDebut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 120, 30));

    dateFin.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
dateFin.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
dateFin.setShowOneMonth(true);
getContentPane().add(dateFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 110, 30));

jLabel3.setText("DE");
getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, 30));

jLabel4.setText("A");
getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));
getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, -1));

achatTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
achatTable.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
    },
    new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
    }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    achatTable.setDefaultRenderer(Double.class, new DoubleRenderer());
    achatTable.setFocusable(false);
    jScrollPane1.setViewportView(achatTable);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 410, 300));

    venteTable.setModel(new javax.swing.table.DefaultTableModel(
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
    venteTable.setMaximumSize(new java.awt.Dimension(2500, 6400));
    venteTable.setPreferredSize(new Dimension(250,model.getRowCount()*16));
    jScrollPane2.setViewportView(venteTable);

    getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 380, 300));

    jLabel5.setBackground(new java.awt.Color(51, 51, 255));
    jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("Achats");
    jLabel5.setOpaque(true);
    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 131, 410, -1));

    jLabel6.setBackground(new java.awt.Color(51, 51, 255));
    jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("Ventes");
    jLabel6.setOpaque(true);
    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 130, 378, 30));
    getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, -1));

    customerSoldeTextField.setEditable(false);
    customerSoldeTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    customerSoldeTextField.setRequestFocusEnabled(false);
    getContentPane().add(customerSoldeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 120, 30));

    jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel7.setText("Solde");
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 86, -1, -1));

    rechercherButton.setText("commencer");
    rechercherButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            rechercherButtonActionPerformed(evt);
        }
    });
    getContentPane().add(rechercherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

    jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    jLabel8.setText("Nombre de produits :");
    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 485, -1, -1));

    nombreEnregistrementTextField.setEditable(false);
    nombreEnregistrementTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    getContentPane().add(nombreEnregistrementTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 50, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fournisseurTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fournisseurTextFieldKeyPressed
        processKeyPressed(evt);
    }//GEN-LAST:event_fournisseurTextFieldKeyPressed

    private void fournisseurTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fournisseurTextFieldKeyTyped
        processKeyTyped(evt);
    }//GEN-LAST:event_fournisseurTextFieldKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        processWindowGainedFocus(evt);
    }//GEN-LAST:event_formWindowGainedFocus

    private void fourniseurSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourniseurSearchButtonActionPerformed
        processButtonActionPerformed(evt);
    }//GEN-LAST:event_fourniseurSearchButtonActionPerformed

    private void rechercherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherButtonActionPerformed
        processButtonActionPerformed(evt);
    }//GEN-LAST:event_rechercherButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable achatTable;
    private javax.swing.JTextField customerSoldeTextField;
    private datechooser.beans.DateChooserCombo dateDebut;
    private datechooser.beans.DateChooserCombo dateFin;
    private javax.swing.JButton fourniseurSearchButton;
    private javax.swing.JTextField fournisseurTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreEnregistrementTextField;
    private javax.swing.JButton rechercherButton;
    private javax.swing.JTable venteTable;
    // End of variables declaration//GEN-END:variables

    private void processKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            processButtonActionPerformed(e);
        }
    }

    private void processKeyTyped(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();
        if (Character.isLowerCase(keyChar)) {
            e.setKeyChar(Character.toUpperCase(keyChar));
        }
    }

    private void processWindowGainedFocus(WindowEvent e) {
        ArrayList<Object> result = clientChoice.getResult(); 
	try{
            if (result.size() != 0){
                            fournisseurTextField.setText((String)result.get(0));
                            customerSoldeTextField.setText (result.get(1).toString());
            }
	}catch(NullPointerException ex){}
    }

    private void processButtonActionPerformed(AWTEvent evt) {
        if ((evt.getSource() == fourniseurSearchButton)||
                (evt.getSource() == fournisseurTextField)){
            clientChoice.show(fournisseurTextField.getLocationOnScreen().x, 
                              fournisseurTextField.getLocationOnScreen().y + 
                                      fournisseurTextField.getHeight(),
                              400, 
                              fournisseurTextField.getText());
        }else if (evt.getSource() == rechercherButton){
            processSearch();
        }
    }

    private void processSearch() {
        dataTable = new JDBCAdapter(Utilities.URL,Utilities.DRIVER_NAME,
                                    Utilities.USER, Utilities.PASSWORD); 
        dataTable.executeQuery( achatSQL +"'"
                                + fournisseurTextField.getText()
                                + "'"
                                + "GROUP BY p.DESIG ORDER BY p.DESIG");
        achatTable.setModel(dataTable);
        achatTable.getColumnModel().getColumn(0).setPreferredWidth(350);
        achatTable.repaint();
        nombreEnregistrementTextField.setText
                            (Integer.toString(achatTable.getRowCount()));
        new Thread(){
            public void run(){
               processRelatedSearch(); 
            }
        }.start();
    
        
    }

    private void processRelatedSearch() {
        dataTable2 =  new JDBCAdapter(Utilities.URL,Utilities.DRIVER_NAME,
                                      Utilities.USER, Utilities.PASSWORD); 
        model = new BalanceTableModel();
        venteTable.setModel(model);
        venteTable.repaint();
        for (int i = 0; i < achatTable.getRowCount(); i++){   
            composeSearch(i);
        }
    }

    private void composeSearch(int x) {
        
        searchString = venteSQL + "'" +
            (String)achatTable.getValueAt(x, 0)
                + "' ";
        searchString += "Group by p.DESIG Order by p.DESIG";
        //Executing a query over this composed string
        System.out.println(searchString);
        dataTable2.executeQuery(searchString);
        if (dataTable2.getRowCount()>0){
            BalanceItem bi = new BalanceItem();
            bi.setProduct((String)dataTable2.getValueAt(0,0));
            BigDecimal bd = (BigDecimal) dataTable2.getValueAt(0, 1);
            bi.setQuantity(bd.doubleValue());
            bd = ((BigDecimal)dataTable2.getValueAt(0, 2));
            bi.setQuantityUnit(bd.doubleValue());
            model.add(bi);
        }
        int height = (x + 1) * 16;
        System.out.println(height);
        venteTable.setModel(model);
        venteTable.setPreferredSize(new Dimension(250,model.getRowCount()*16));
        System.out.println(venteTable.getRowCount());
        venteTable.getColumnModel().getColumn(0).setPreferredWidth(350);
        venteTable.repaint();
    }
}