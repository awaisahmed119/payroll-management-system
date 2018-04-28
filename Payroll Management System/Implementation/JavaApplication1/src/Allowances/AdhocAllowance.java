/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Allowances;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javaapplication1.DBconnection;
import javax.swing.JOptionPane;

 
public class AdhocAllowance extends allowance {
    int fix=0;
    

    public AdhocAllowance(String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
    }

    @Override
     public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
        //checking
        
        
        if(check(id,"A120X")){
        
            try{
                
                 String sql ="update empallowances set A120X_adhoc2010="+fix+" where empid="+"'"+id+"'" ;
                            PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                             preStat.executeUpdate();
            }
            
            catch (SQLException insertException) {
                           System.out.println("Error:"+insertException.getMessage());
                           JOptionPane.showMessageDialog(null, "ERROR: Can't calculate an allowance");
                      }
            
        
        }
       
      return 0;   
    }
    /*
public boolean check(String id){
    
   
      
         try {
                        
                           String sql ="select A120X from empallowancescheck where empid="+"'"+id+"'" ;
                            PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                            ResultSet rs = preStat.executeQuery();
                            if(rs.next()){
                                if(rs.getBoolean("A120X")){
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
    */
    
    
    
    @Override
    public void setObjectHead(String ObjectHead) {
        super.setObjectHead(ObjectHead); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getObjectHead() {
        return super.getObjectHead(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setObjectDetail(String ObjectDetail) {
        super.setObjectDetail(ObjectDetail); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getObjectDetail() {
        return super.getObjectDetail(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
