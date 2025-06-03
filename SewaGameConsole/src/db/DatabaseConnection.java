/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/rent?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root"; // sesuaikan dengan username database Anda
    private static final String PASSWORD = ""; // sesuaikan dengan password database Anda
    
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver tidak ditemukan: " + e.getMessage());
        }
    }
    
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // Test connection
        if (conn != null && !conn.isClosed()) {
            return conn;
        } else {
            throw new SQLException("Tidak dapat membuat koneksi database");
        }
    }
}