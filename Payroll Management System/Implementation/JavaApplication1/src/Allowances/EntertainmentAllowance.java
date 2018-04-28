package Allowances;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
public class EntertainmentAllowance extends allowance {
    int fixedfor19 = 500;
    int fixedfor20 = 600;
    int val=0;
    public EntertainmentAllowance(String ObjectDetail, String ObjectHead) {
        super(ObjectDetail, ObjectHead);
    }

    public int getFixedfor19() {
        return fixedfor19;
    }

    public void setFixedfor19(int fixedfor19) {
        this.fixedfor19 = fixedfor19;
    }

    public int getFixedfor20() {
        return fixedfor20;
    }

    public void setFixedfor20(int fixedfor20) {
        this.fixedfor20 = fixedfor20;
    }

    @Override
     public int calculateAllowance(String id,int scale, int basicSalary,String qual) {
        
     switch (scale) {
            case 19:
                val= fixedfor19;
            case 20:
                val= fixedfor20;
            default:
                val= 0;
        }
    
        
          if(check(id,"A01224")){
        
            try{
                
                 String sql ="update empallowances set A01224_ent="+val+" where empid="+"'"+id+"'" ;
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
