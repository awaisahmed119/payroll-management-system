/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deduction;
 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Awais
 */
public class GPfund extends deduction {
    int val=0;

    public GPfund(String name) {
        super(name);
    }

    @Override
    public int calculateDeduction(int scale, int basicSalary,String id) {
        //calculations
        
        
        
        if(check(id,"gpfund")){
        
            try{
                
                 String sql ="update empdeduction set GPfund="+val+" where empid="+"'"+id+"'" ;
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
