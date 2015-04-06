/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 1. Copy the code 
 * 2. Change the username, password and url same as your database
     3. IMPORT
 * @author Owner
 */
public class Connector {

    private String username = "DWfinal"; //username
    private static String password = "jcd1234";
    private String host = "localhost";
    private String port = "3306";
    private String url = "jdbc:mysql://" + host + ":" + port + "/devweb";
    private String driver = "com.mysql.jdbc.Driver";

    public Connection getConnection() {
        try {
            Class.forName(driver);
            Connection c = DriverManager.getConnection(url, username, password);
            return c;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
