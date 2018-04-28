/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;




import forms.form;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.Statement;


/**
 *
 * @author Awais
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Employee em ;
       com.mysql.jdbc.Connection conn = new DBconnection().connect();
     
       try{
        String sql = "select remaininghba from employee where id=? ";
         PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("return successful");
                System.out.println(rs.getInt("remaininghba"));
                
                if (rs.getInt("remaininghba")>0){
                    System.out.println("bnda khtrnak hai ");
                }
                else
                    System.out.println("shareef bnda hai ");
               
                
                
                
                if (true){
                    System.out.println("^.^");
                }

           
            }
       }
            catch (Exception e) {
            System.out.println("return successful" + e);
        }
    
          new form().show();
    }
}
