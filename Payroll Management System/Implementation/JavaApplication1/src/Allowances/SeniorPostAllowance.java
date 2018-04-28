package Allowances;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author sheikh-hamza
 */
public class SeniorPostAllowance extends allowance{

    int fixed = 1250;
    int val=0;
    public SeniorPostAllowance(String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
    }

    public int getFixed() {
        return fixed;
    }

    public void setFixed(int fixed) {
        this.fixed = fixed;
    }
    
    @Override
      public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
        if(scale >= 20) val= fixed;
        else val= 0;
        
          if(check(id,"A01201")){
        
            try{
                
                 String sql ="update empallowances set A01201_spost="+val+" where empid="+"'"+id+"'" ;
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
