package Allowances;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
public class DeputationAllowance extends allowance{
    int maxAllowance = 12000;
    int fvalue=0;

    public int getMaxAllowance() {
        return maxAllowance;
    }

    public void setMaxAllowance(int maxAllowance) {
        this.maxAllowance = maxAllowance;
    }
    

    public DeputationAllowance(String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
    }

    @Override
     public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
         int value=0;
        float value1 = (float )((float)  basicSalary * (float)(20.0/100.0));
        value=(int)value1;
        if(value >= maxAllowance ){
            fvalue=maxAllowance;
        }
        else fvalue= value;
        
        
        if(check(id,"A01236")){
        
            try{
                
                 String sql ="update empallowances set A01236_dep="+fvalue+" where empid="+"'"+id+"'" ;
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
    
    
    
    
}
