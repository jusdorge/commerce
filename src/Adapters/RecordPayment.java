/*
 * la licence de ce projet est accorder 
 * a l'entreprise bbs benhaddou brother's software
 * marque deposer aupr�s des autorit�s responsable * 
 */
package Adapters;

/**
 *
 * @author ahmed
 */
public class RecordPayment {
    JDBCAdapter conn;
    private Object OPE; 
    private Object TAB;
    private Object IDV;
    private Object ID;
    private Object D;
    private Object T;
    private Object MODE;
    private Object NC;
    private Object BANC;
    private Object MONT;
    private Object UTIL;
    private Object OBS;
    private Object IDA;
    private Object P;
    public RecordPayment( Object OPE,   //01
                            Object TAB, //02
                            Object IDV, //03
                            Object ID,  //04
                            Object D,   //05
                            Object T,   //06
                            Object NC,  //07
                            Object BANC,//08
                            Object MONT,//09
                            Object UTIL,//10
                            Object OBS, //11
                            Object IDA, //12 
                            Object P,   //13
                            Object MODE)//14
    {
        this.OPE = OPE;
        this.TAB = TAB;
        this.IDV = IDV;
        this.ID = ID;
        this.D = D;
        this.T = T;
        this.MODE = MODE;
        this.NC = NC;
        this.BANC = BANC;
        this.MONT = MONT;
        this.UTIL = UTIL;
        this.OBS = OBS;
        this.IDA = IDA;
        this.P = P;
        conn = JDBCAdapter.connect();
    }
    private String getDeleteString(){
        String result ="CALL PROC_VERS(";
        result += 3 + ",";
        result += TAB + ",";
        result += IDV + ",";
        result += ID + ",'";
        result += D + "','";
        result += T + "',";
        result += NC + "','";
        result += BANC + "',";
        result += MONT + ",";
        result += UTIL + ",'";
        result += OBS + "',";
        result += IDA + ",'";
        result += P + "',";
        result += "'" + MODE + "')";
        return result;
        
    }
    private String getRecordString(){
        String result ="CALL PROC_VERS(";
        result += OPE + ",";
        result += TAB + ",";
        result += IDV + ",";
        result += ID + ",'";
        result += D + "','";
        result += T + "','";
        result += NC + "','";
        result += BANC + "',";
        result += MONT + ",";
        result += UTIL + ",'";
        result += OBS + "',";
        result += IDA + ",'";
        result += P + "',";
        result += "'" + MODE + "')";
        return result;
    }
    public void recordPayment(){
        conn.executeQuery(getRecordString());
        System.out.println(getRecordString());
        if (conn.ErrorExists())
            System.out.println(conn.getErrorCause()+"\n"
                                +conn.getErrorMessage());
    }
    
    public void deletePayment(){
        conn.executeUpdate(getDeleteString());
    }
}
