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
public class GI extends deduction{
    int fix=0;

     public GI(String name) {
        super(name);
    }
     
    @Override
     public int calculateDeduction(int scale, int basicSalary,String id) {
        if(check(id,"gi")){
        
            try{
                
                 String sql ="update empdeduction set GroupInsurance="+fix+" where empid="+"'"+id+"'" ;
                            PreparedStatement  preStat =(PreparedStatement) conn.prepareStatement(sql);
                    
                             preStat.executeUpdate();
            }
            
            catch (SQLException insertException) {
                           System.out.println("Error:"+insertException.getMessage());
                           JOptionPane.showMessageDialog(null, "ERROR: Can't calculate a deduction");
                      }
            
        } //To change body of generated methods, choose Tools | Templates.
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
