/*
 * la licence de ce projet est accorder 
 * a l'entreprise bbs benhaddou brother's software
 * marque deposer aupres des autorites responsable * 
 */
package Adapters;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import util.FileProcess;

/**
 *
 * @author BENHADDOU MOHAMED AMINE
 * classe pour l'enregistrement des operations
 * header pour l'entete de l'operation
 * buttol pour le corp de l'operation
 */
public class RecordOperation {
    private int tab;
    private int ope;
    private Header h;
    private TableModel m;
    private ArrayList allRecordButtoms;
    
            
    public RecordOperation(int TAB, int OPE,Header head, TableModel model){
        tab = TAB;
        ope = OPE;
        h = head;
        m = model;
        allRecordButtoms = new ArrayList();
    }
    
    private String getTableName(){
        String table="";
        switch(tab){
            case 1:
                table = "achat";
            break;
            case 2:
                table = "vente";
            break;
            case 3:
                table = "reta";
            break;
            case 4:
                table = "retv";
            break;
            case 5:
                table = "commande";
            break;
            case 6:
                table = "devis";
            break;
            case 7:
                table = "fact";
            break;
            case 8:
                table = "pert";
            break;
            case 9:
                table = "trans";
            break;
        }
        return table;
    }
    
    private String getHeadString(){
        String sql =  tab + "," + 
                h.getIda() + "," +
                h.getId() + "," +
                h.getIdv() + ",'" +
                h.getDate() + "','" +
                h.getTime() + "'," +
                h.getUtil()+ ",'" + 
                h.getObs() + "'," +
                h.getIdUtil() + ",'" +
                h.getP() + "','" +
                h.getMode()+"')";
        return sql;
    }
    
    public String getRecordHeadString(){
        String sql_head = "CALL PROC_ACHAT(" + 
                1 + "," + getHeadString();
        return sql_head;
    }
    
    private String getDeleteHeadString(){
        String sql = "CALL PROC_ACHAT(" + 
                3 + "," + getHeadString();
        return sql;
    }
    
    private String getUpdateHeadString(){
        String sql = "CALL PROC_ACHAT(" + 
                2 + "," + getHeadString();
        return sql;
    }
    
    private String getButtomString(Buttom b){
        String sql = tab + "," +
                b.getIda() + "," +
                b.getIdp() + "," +
                b.getTva() + "," +
                b.getQtea() + "," +
                b.getQtua() + "," +
                b.getPrixa() + "," +
                b .getSt() + "," +
                b.getIdd() +
                ")";
        return sql;
    }
    private String getDeleteButtomString(Buttom b){
        String sql_buttom = "CALL PROC_LACHAT (" +
                3 + "," + getButtomString(b); 
        return sql_buttom;        
    }
    public String getRecordButtomString(Buttom b){
        String sql_buttom = "CALL PROC_LACHAT (" +
                1 + "," + getButtomString(b); 
        return sql_buttom;
    }
    
    public String getUpdateButtomString(Buttom b){
        String sql_buttom = "CALL PROC_LACHAT (" +
                2 + "," + getButtomString(b); 
        return sql_buttom;
    }
    
    public void recordHead(){
        JDBCAdapter record_head = JDBCAdapter.connect();
        if (ope == 1){
            record_head.executeQuery(getRecordHeadString());
        }else{
            System.out.println(getRecordHeadString());
            record_head.executeUpdate(getRecordHeadString());       
        }
        System.out.println(getRecordHeadString());
        if (record_head.getUpdateError())
            System.err.println(record_head.getErrorMessage() +"\n"
                    +record_head.getErrorCause());
    }
    
    public void deleteHead(){
        JDBCAdapter deleteHead = JDBCAdapter.connect();
        deleteHead.executeUpdate(getDeleteHeadString());
        System.out.println(getDeleteHeadString());
        if (deleteHead.getUpdateError())
            System.err.println(deleteHead.getErrorMessage() + deleteHead.getErrorCause());
    }
    
    public void UpdateHead(){
        JDBCAdapter updateHead = JDBCAdapter.connect();
        updateHead.executeUpdate(getUpdateHeadString());
        System.out.println(getUpdateHeadString());
        if (updateHead.getUpdateError())
            System.err.println(updateHead.getErrorMessage() + updateHead.getErrorCause());
    }
    
    public ArrayList getAllRecordButtoms(){
        return allRecordButtoms;
    }
        
    private Buttom ButtomFactory(int i){
        ArrayList l = new ArrayList();
        Product p = new Product(m.getValueAt(i, 0));
        l.add(0, h.getIda()); //----ida
        l.add(1, p.getId());//------idp
        l.add(2,0);//---------------tva
        l.add(3, getQtea(i));//-----qtea
        l.add(4, getQtua(i));//-----qtua
        l.add(5, getPrixa(i));//----prixa
        l.add(6, p.getStock());//---st
        l.add(7,1);
        Buttom b = new Buttom(l);
        return b;
    }
    /**
     * records all the lines of the operation
     * @throws SQLException 
     */
    public void recordAllButtoms() throws SQLException{
        for (int i = 0; i < m.getRowCount(); i++){
            Buttom b = ButtomFactory(i);
            allRecordButtoms.add(b);
            JDBCAdapter record_buttom = JDBCAdapter.connect();
            record_buttom.executeQuery(getRecordButtomString(b));
            System.out.println(getRecordButtomString(b));
            if (record_buttom.getUpdateError())
                System.err.println(record_buttom.getErrorMessage() + "\n"
                        + record_buttom.getErrorCause());
            else{
                record_buttom.close();
            }
        }   
    }
    
    /**
     * updates all the lines of the operation
     * @throws java.sql.SQLException
     */
    public void UpdateAllButtoms() throws SQLException{
        JDBCAdapter deleteRecords = JDBCAdapter.connect();
        String sql1 ="SELECT desig FROM l" + getTableName()
                    + " LEFT JOIN produit on l" + getTableName()
                    + ".idp=produit.idp "
                    + "WHERE ida=" + h.getIda();
        deleteRecords.executeQuery(sql1);
        if (deleteRecords.getRowCount() > m.getRowCount()){
            //find the record to delete
            ArrayList originalRecords = new ArrayList<>();
            for (int a = 0; a < deleteRecords.getRowCount(); a++){
                originalRecords.add(deleteRecords.getValueAt(a, 0));
            }

            for (int i=0; i < m.getRowCount(); i++){
                String des = (String)m.getValueAt(i, 0);
                for (int j =0; j < deleteRecords.getRowCount(); j++){
                    String desi = (String)deleteRecords.getValueAt(j, 0);
                    if (desi.equals(des)){
                        originalRecords.remove(desi);
                        break;
                    }
                }
            }
            //delete the unused records from the database
            for (int x = 0; x < originalRecords.size(); x++){
                Product p = new Product((String)originalRecords.get(x));
                String sql = "delete From l" + getTableName()
                        + " WHERE ida=" + h.getIda()
                        + " AND idp=" + p.getId();
                deleteRecords.executeUpdate(sql);
            }
        }
        for (int i = 0; i < m.getRowCount(); i++){
            Buttom b = ButtomFactory(i);
            allRecordButtoms.add(b);
            JDBCAdapter update_buttom = JDBCAdapter.connect();
            String sql = "SELECT * FROM l" + getTableName() +
                        " WHERE ida=" + b.getIda() +
                        " AND idp=" + b.getIdp();
            update_buttom.executeQuery(sql);
            if (update_buttom.getRowCount()>0){
                sql = getUpdateButtomString(b);
                update_buttom.executeQuery(sql);
            }else{
                sql = getRecordButtomString(b);
                update_buttom.executeUpdate(sql);
            }
            System.out.println(sql);
            if (update_buttom.getUpdateError())
                System.err.println(update_buttom.getErrorMessage() + "\n"
                        + update_buttom.getErrorCause());
            else{
                update_buttom.close();
            }
        }
    }
    
    /**
     * deletes all the lines of the operation
     */
    public void deleteAllButtoms(){
        String sql = "DELETE FROM L" + getTableName() + 
                    " WHERE ida=" + h.getIda();
        JDBCAdapter record_buttom = JDBCAdapter.connect();
        record_buttom.executeUpdate(sql);
        System.out.println(sql);
        if (record_buttom.getUpdateError())
            System.err.println(record_buttom.getErrorMessage() + 
                    record_buttom.getErrorCause());
    }
    
    private Object getQtea(int i){
        return m.getValueAt(i, 1);
    }
    private Object getQtua(int i){
        return m.getValueAt(i, 2);
    }
    private Object getPrixa(int i){
        return m.getValueAt(i, 3);
    }
/**
 * BENHADDOU MOHAMED AMINE
 * une classe pour l'extraction de l'id et le stock 
 * de la table produit 
 */
    class Product{
        private Object id;
        private Object stock;
        JDBCAdapter look;
        
        public Product(Object des){
            if (!des.equals("")){
                look = JDBCAdapter.connect();
                String sql ="SELECT idp, stock FROM produit WHERE desig ='" + des +"'";
                look.executeQuery(sql);
                id = look.getValueAt(0, 0);
                stock = look.getValueAt(0, 1);
            }
        }
        public Object getId(){
            return id;
        }
        public Object getStock(){
            return stock;
        }
    }
}