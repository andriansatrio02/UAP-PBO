/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBHelper {
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static String DB = "kasir";
    private static String MYCONN = "jdbc:mysql://localhost/"+DB;
    
    public static Connection getConnection(){
    Connection conn = null;
        try {
            conn = DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
            System.out.println("connection success");
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("connection failed");
        }
        return conn;
    }

}
