/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.farhan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtil {
    
    private static Connection farhan_connection;

    public static Connection getConnection() {
        if (farhan_connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/farhan_store";
                String user = "root";
                String password = "";

                farhan_connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return farhan_connection;
    }
}