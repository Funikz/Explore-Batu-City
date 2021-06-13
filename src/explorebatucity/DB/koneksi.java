/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorebatucity.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zidan
 */
public class koneksi {
    private static Connection mysqlConn;
    
    public static Connection koneksiDB() throws SQLException {
        if(mysqlConn==null){
            try {
                String DB="jdbc:mysql://localhost:3306/explorebatucity"; // database explorebatucity
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlConn = (Connection) DriverManager.getConnection(DB,user,pass);
          
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Koneksi Gagal");
            }
        }
        return mysqlConn;
    }
}
