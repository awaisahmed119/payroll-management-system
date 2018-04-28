/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package deduction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication1.DBconnection;
import javax.swing.JOptionPane;

/**
 *
 * @author Awais
 */
public abstract class deduction {
    String name;
     public com.mysql.jdbc.Connection conn = new DBconnection().connect();

    public deduction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract int calculateDeduction(int scale,int basicSalary,String empid);
    public boolean check(String id,String dname){
    
   
      
         try {
                        
                           String sql ="select "+dname+" from empdeductioncheck where empid="+"'"+id+"'" ;
                           PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                            ResultSet rs = preStat.executeQuery();
                            if(rs.next()){
                                if(rs.getBoolean(dname)){
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
