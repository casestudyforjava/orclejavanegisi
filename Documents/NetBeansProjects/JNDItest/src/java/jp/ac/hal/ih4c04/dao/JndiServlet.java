/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ih4c04.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author yuta
 */
public class JndiServlet extends HttpServlet {
     protected Connection getConnection() throws SQLException {
 try { 
Class.forName("oracle.jdbc.driver.OracleDriver");
 } catch (ClassNotFoundException e) { 
throw new RuntimeException(e); 
} 
Connection con = DriverManager.getConnection( 
"jdbc:oracle:thin:@TSTDSV03:1521:orcl3", 
"IH4C04",
"ih4c04"); 
con.setAutoCommit(false); 
return con; 
}
}
