
package jp.ac.hal.ih41.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jp.ac.hal.ih41.beans.TableUsers;

/**
 * usersテーブル関係のDao
 *
 * @author kiaamaaio
 */
public class UsersDao {
    
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet result = null;
    SettingDatabase sd = null;
    
    /**
     * 全件取得する。
     * 
     * @return 
     */
    public List<TableUsers> findAll(){
        
        sd = new SettingDatabase();
        ArrayList<TableUsers> users = new ArrayList<TableUsers>();
        
        try{
            con = sd.getConnection();
            String sql = "SELECT * FROM users";
            stmt = con.prepareStatement(sql);
            result = stmt.executeQuery();
            
            while(result.next()){
                TableUsers user = new TableUsers();
                user.setUsersId(result.getString("users_id"));
                user.setUsersPassword(result.getString("users_password"));
                user.setUsersName(result.getString("users_name"));
                users.add(user);
            }
            
            stmt.close();
            con.close();
            
        }catch(SQLException e){
            //
        }
        
        return users;
    }
    
    public List<TableUsers> findById(String updateId){
        
        sd = new SettingDatabase();
        ArrayList<TableUsers> users = new ArrayList<TableUsers>();
        
        try{
            con = sd.getConnection();
            String sql = "SELECT * FROM users WHERE users_id=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, updateId);
            result = stmt.executeQuery();
            
            while(result.next()){
                TableUsers user = new TableUsers();
                user.setUsersId(result.getString("users_id"));
                user.setUsersPassword(result.getString("users_password"));
                user.setUsersName(result.getString("users_name"));
                users.add(user);
            }
            
            stmt.close();
            con.close();
            
        }catch(SQLException e){
            //
        }
        
        return users;
    }
    
}
