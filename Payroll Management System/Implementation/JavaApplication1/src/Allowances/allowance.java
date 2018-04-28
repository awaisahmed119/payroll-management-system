package Allowances;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication1.DBconnection;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
public abstract class allowance {
    
    String ObjectDetail;
    String ObjectHead;
     public com.mysql.jdbc.Connection conn = new DBconnection().connect();

    public allowance(String ObjectDetail, String ObjectHead) {
        this.ObjectDetail = ObjectDetail;
        this.ObjectHead = ObjectHead;
    }

    public String getObjectDetail() {
        return ObjectDetail;
    }

    public void setObjectDetail(String ObjectDetail) {
        this.ObjectDetail = ObjectDetail;
    }

    public String getObjectHead() {
        return ObjectHead;
    }

    public void setObjectHead(String ObjectHead) {
        this.ObjectHead = ObjectHead;
    }
    
    public abstract int calculateAllowance(String id,int scale,int basicSalary,String qual);
    
   public boolean check(String id,String alname){
    
   
      
         try {
                        
                           String sql ="select "+alname+" from empallowancescheck where empid="+"'"+id+"'" ;
                           PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                            ResultSet rs = preStat.executeQuery();
                            if(rs.next()){
                                if(rs.getBoolean(alname)){
                                    return true;
                                }
                                
                            }
                     
                                preStat.close();

                      } catch (SQLException insertException) {
                           System.out.println("Error:"+insertException.getMessage());
                           JOptionPane.showMessageDialog(null, "ERROR: Can't calculate an allowance");
                      }
    return false;
    
}
}
