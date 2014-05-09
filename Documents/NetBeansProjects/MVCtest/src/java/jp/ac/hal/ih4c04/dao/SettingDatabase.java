/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ih4c04.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yuta
 */
public class SettingDatabase {
    protected Connection getConnection() throws SQLException {
        try { 
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) { 
            throw new RuntimeException(e); 
        } 
        Connection con = DriverManager.getConnection( 
            "jdbc:mysql://localhost/sakila","root",""); 
        con.setAutoCommit(false);
        return con;
    }
}
