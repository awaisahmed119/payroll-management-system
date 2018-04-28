/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deduction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaapplication1.DBconnection;

/** 
 *
 * @author Awais
 */
public class HBA extends deduction {
    int fixed=1;// need to initialize 
    int val=0;

    public HBA(String name) {
        super(name);
    }

    @Override
    public int calculateDeduction(int scale, int basicSalary,String empid) {
        
       com.mysql.jdbc.Connection conn = new DBconnection().connect();
     
       int r=0;
       
       try{
        String sql = "select remaininghba from employee where id=? ";
         PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1, empid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("return successful");
               r=rs.getInt("remaininghba");
                if (rs.getInt("remaininghba")>0){
                   
                    
                    
                    
                }
                else
                   return 0;

           
            }
       }
            catch (Exception e) {
            System.out.println("return successful" + e);
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
