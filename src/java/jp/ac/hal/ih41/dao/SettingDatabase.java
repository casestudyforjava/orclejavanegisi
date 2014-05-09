
package jp.ac.hal.ih41.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kiaamaaio
 */
public class SettingDatabase {
    
    protected Connection getConnection() throws SQLException {
        try { 
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) { 
            throw new RuntimeException(e);
        } 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ih4c", "root", ""); 
        con.setAutoCommit(false); 
        return con; 
    }
    
}
