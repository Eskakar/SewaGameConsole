/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nabil
 */
public class DatabaseConnection {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/latres_prakpbo";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Connected to DB");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
    
    
}