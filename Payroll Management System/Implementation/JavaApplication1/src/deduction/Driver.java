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
public class Driver extends deduction {

    int fixed;
    int val=0;
    
    public Driver(String name) {
        super(name);
    }

    @Override
     public int calculateDeduction(int scale, int basicSalary,String id) {
     
        boolean check=false;
         com.mysql.jdbc.Connection conn = new DBconnection().connect();
     
       try{
        String sql = "select monetization from employee where id=? ";
         PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("return successful"); 
                if (rs.getBoolean("monetization")){
                    check=true;
                }

           
            }
       }
            catch (Exception e) {
            System.out.println("return successful" + e);
        }
        
        
        
        
        if(check){
        fixed=10000;
        val= fixed;
        }
        else 
            val=0;
        
        if(check(id,"driver")){
        
            try{
                
                 String sql ="update empdeduction set driver="+val+" where empid="+"'"+id+"'" ;
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

    
    public void setFixed(int fixed) {
        this.fixed = fixed;
    }

    public int getFixed() {
        return fixed;
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
