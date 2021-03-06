/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommerceApp;

import Adapters.FrameAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import util.FileProcess;
import util.Operation;
import util.Utilities;

/**
 *
 * @author DELL
 */
public class Demarrage extends javax.swing.JFrame {
    
    private static OperationWindow create_sell;
    private static OperationWindow create_buy;
    private static OperationWindow create_sell_return;
    private static OperationWindow create_buy_return;
    private static QuitFrame quitFrame;
    private static String currentAction = "";
    private static SaveFrame saveFrame;
   
    /**
     * Creates new form Demarrage
     */
    public Demarrage() {
        initComponents();
        setIconImage(Utilities.setIconImage(this));
        FrameAdapter.centerFrame(this);
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
        progressBar = new javax.swing.JProgressBar();
        informationLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setPreferredSize(new java.awt.Dimension(304, 214));
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        progressBar.setBackground(new java.awt.Color(204, 204, 204));
        progressBar.setForeground(new java.awt.Color(0, 255, 0));
        progressBar.setMaximum(120);
        progressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        progressBar.setOpaque(true);
        progressBar.setPreferredSize(new java.awt.Dimension(304, 14));
        getContentPane().add(progressBar, java.awt.BorderLayout.PAGE_START);
        getContentPane().add(informationLabel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Create and display the form */
        Demarrage dem = new Demarrage();
        dem.setVisible(true);
        try {
            long patience = 4 * 60 * 60;
            informationLabel.setText("initialisation des varaiable...");
            long startTime = System.currentTimeMillis();
            Thread t = new Thread(new MessageLoop());
            t.start();
            int i = 0;
            progressBar.setMaximum(50);
            progressBar.setStringPainted(true);
            while (t.isAlive()){
                progressBar.setValue(i);
                i = i + 1;
                t.join(100);
                informationLabel.setText(threadMessage());
                if (((System.currentTimeMillis() - startTime) > patience)
                      && t.isAlive()) {
                    informationLabel.setText("Tired of waiting!");
                    t.interrupt();
                    t.join();
                }
            }
            dem.dispose();
            FenetrePrincipale f = new FenetrePrincipale();
            f.setVisible(true);
        } catch (InterruptedException ex) {
            System.out.println("interruption de la tache...");
        }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel informationLabel;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
    private static String threadMessage(){
        String result = "initialisation en cours..." + currentAction;
        
        return result;
    }
    public static OperationWindow getOperation(Operation o, FileProcess fp){
        OperationWindow result = null;
        switch (o){
            case SELL:
                switch (fp){
                    case CREATE:
                        result = create_sell;
                }
            break;
            case BUY:
                switch (fp){
                    case CREATE:
                        result = create_buy;
                }
            break;
            case SELLBACK:
                switch (fp){
                    case CREATE:
                        result = create_sell_return;
                }
            break;
            case BUYBACK:
                switch (fp){
                    case CREATE:
                        result = create_buy_return;
                }
            break;
        }
        return result;
    }
    
    public static JFrame getFrame(String frameName){
        JFrame result = null;
        switch (frameName){
            case "SAVE":
                //result = saveFrame;
                break;
            case "RESTORE":
                //result = restoreFrame;
                break;
                
        }
        return result;
    }
    
    public static JInternalFrame getInternalFrame(String frameName){
        
        JInternalFrame result = null;
        switch (frameName){
            case "QUIT":
                result = quitFrame;
                break;
            default :
                result = null;
                break;
        }
        return result;
    }

    private static class MessageLoop
        implements Runnable {
        public void run() {  
            try {
                Thread.sleep(1000);
                //create_sell = new OperationWindow(Operation.SELL, FileProcess.CREATE);
                currentAction = "creation vente";
                Thread.sleep(1000);
                //create_buy = new OperationWindow(Operation.BUY, FileProcess.CREATE);
                currentAction = "creation achat";
                Thread.sleep(1000);
                //create_sell_return = new OperationWindow(Operation.SELLBACK, FileProcess.CREATE);
                currentAction = "creation retour de vente";
                Thread.sleep(1000);
                //create_buy_return = new OperationWindow(Operation.BUYBACK, FileProcess.CREATE);
                currentAction = "creation retour d'achat";
                Thread.sleep(1000);
                quitFrame = new QuitFrame();
                currentAction = "creation de la fenetre ferme";  
                Thread.sleep(1000);
                //saveFrame = new SaveFrame(parentFrame);
                currentAction = "creation de la fenetre save";
                Thread.sleep(1000);
                currentAction = "finalisation.....";                
            } catch (InterruptedException ex) {
                Logger.getLogger(Demarrage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

