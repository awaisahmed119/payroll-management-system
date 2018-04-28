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
public class HRD extends deduction {
   
    int val=0;
    public HRD(String name) {
        super(name);
    }

    @Override
     public int calculateDeduction(int scale, int basicSalary,String id) {
         com.mysql.jdbc.Connection conn = new DBconnection().connect();
         
          int bpay=0;
          try{
        String sql = "select basicpay from payscalechart where scale=? ";
         PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, scale);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                
                System.out.println("return successful");
                System.out.println(rs.getString("basicpay"));
               bpay= rs.getInt("basicpay");
              
            }
       }
            catch (Exception e) {
            System.out.println("exception generated" + e);
        }
        val= (int) (bpay*0.05);
        
        
         if(check(id,"hrd")){
        
            try{
                
                 String sql ="update empdeduction set HouseRentDed="+val+" where empid="+"'"+id+"'" ;
                            PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                             preStat.executeUpdate();
            }
            
            catch (SQLException insertException) {
                           System.out.println("Error:"+insertException.getMessage());
                           JOptionPane.showMessageDialog(null, "ERROR: Can't calculate a deduction");
                      }
            
        }
        
        
        return 0;
         }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    
   

    
     
}
