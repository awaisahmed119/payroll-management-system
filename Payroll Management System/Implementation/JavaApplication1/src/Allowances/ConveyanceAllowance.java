package Allowances;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
public class ConveyanceAllowance extends allowance{
    int val=0;

    public ConveyanceAllowance(String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
    }

    @Override
     public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
        //will be retrieve from database
      PreparedStatement pst;
        try{
        String sql="select A01203 from empAllowancesCheck where empid=" +"'"+ id+"'";
         pst = conn.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
         while (rs.next()) {
             if (rs.getInt("A01203")==1){
                        try{
                            String sql1="select conveyance from convHouseAllowance where scale=" + scale;
                            pst = conn.prepareStatement(sql1);
                            ResultSet rs1 = pst.executeQuery();
                            if(rs1.next()){
                            val= rs1.getInt("conveyance");
                            }
                        }
                        catch (SQLException e) {
                            System.out.println("exception " + e);
                            JOptionPane.showMessageDialog(null, "ERROR: Can't calculate an allowance");
          
                        }
                    }
             else
                val= 0;
             
             try{
                
                 sql ="update empallowances set A01203_conv="+val+" where empid="+"'"+id+"'" ;
                            PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                             preStat.executeUpdate();
            }
            
            catch (SQLException insertException) {
                           System.out.println("Error:"+insertException.getMessage());
                           JOptionPane.showMessageDialog(null, "ERROR: Can't calculate an allowance");
                      }
             
             
             
            }
            return 0;
         } catch (SQLException ex) {
            System.out.println("exception " + ex);
            JOptionPane.showMessageDialog(null, "ERROR: Can't calculate an allowance");
        }
        return 0;
    }
    
    
    
}
