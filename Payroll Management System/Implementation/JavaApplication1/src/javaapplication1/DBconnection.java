/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
/**
 *
 * @author Awais
 */
public class DBconnection {
    
     private Connection DBConnection;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Connection fail" + cnfe);
        }
        String url = "jdbc:mysql://localhost:3306/payroll";
        try {
            DBConnection = (Connection) DriverManager.getConnection(url, "root", "1234");
            System.out.println("Database Connected");
        } catch (SQLException se) {
            System.out.println("No database" + se);
        }

        return DBConnection;
    }
}
