/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBConnection {

    protected Connection con;
    protected PreparedStatement preparedStatement;

    protected DBConnection() {
        try {
            String dbURL = "jdbc:sqlserver://" + AppConfig.DB_SERVER + ";encrypt=true;trustServerCertificate=true;database=" + AppConfig.DB_NAME + "";
            con = DriverManager.getConnection(dbURL, AppConfig.DB_USER, AppConfig.DB_PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error while connecting to database.",
                    //                    ex.getMessage(),
                    "DB Error", 0);
        }
    }
}
