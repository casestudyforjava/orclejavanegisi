
package jp.ac.hal.ih41.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jp.ac.hal.ih41.beans.TableUsers;
import jp.ac.hal.ih41.dao.UsersDao;

/**
 * listページのModel
 *
 * @author kiaamaaio
 */
public class UserListModel implements UserInterface {
    
    /**
     * usersテーブルを全件表示するための準備をする。
     * 
     * @param req
     * @param resp 
     */
    public void doBusinessLogic(HttpServletRequest req, HttpServletResponse resp){
        
        UsersDao dao = new UsersDao();
        List<TableUsers> result = dao.findAll();
        req.setAttribute("result", result);
    }
}
