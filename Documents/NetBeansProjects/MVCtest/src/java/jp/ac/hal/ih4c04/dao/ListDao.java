/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ih4c04.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jp.ac.hal.ih4c04.entity.CountryEntity;

/**
 *
 * @author yuta
 */
public class ListDao {
    
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet result = null;
    SettingDatabase sd = null;

    public List<CountryEntity> findAll(){//前回ここまで(MVC制作練習中)
        
        sd = new SettingDatabase();
        ArrayList<CountryEntity> countries = new ArrayList<CountryEntity>();
        
        try{
            con = sd.getConnection();
            String sql = "SELECT * FROM country";
            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();
        
            while(result.next()){
                CountryEntity country = new CountryEntity();
                country.setCountry_id(result.getInt("country_id"));
                country.setCountry(result.getString("country"));
                country.setLast_update(result.getDate("last_update"));
                countries.add(country);
            }
        
            stmt.close();
            con.close();
            
        }catch(SQLException e){
            
        }
        
        return countries;
        
    }
    
}
