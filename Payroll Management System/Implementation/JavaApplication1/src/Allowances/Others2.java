/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Allowances;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane; 

/**
 *
 * @author Awais
 */
public class Others2 extends allowance {

    int fixed = 0;
    public Others2(String ObjectDetail, String ObjectHead) {
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
         if(check(id,"A01270")){
        
            try{
                
                 String sql ="update empallowances set A01270_others="+fixed+" where empid="+"'"+id+"'" ;
                            PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                             preStat.executeUpdate();
            }
            
            catch (SQLException insertException) {
                           System.out.println("Error:"+insertException.getMessage());
                           JOptionPane.showMessageDialog(null, "ERROR: Can't calculate an allowance");
                      }
            
        }
        
        return fixed;
    }
    
    
    
}
