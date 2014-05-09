
package jp.ac.hal.ih41.model;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jp.ac.hal.ih41.beans.TableUsers;
import jp.ac.hal.ih41.dao.UsersDao;

/**
 * updateページのModel
 *
 * @author kiaamaaio
 */
public class UserUpdateModel implements UserInterface {
    
    /**
     * GETの場合、指定されたIDの情報を取得して表示する準備をする。
     * POSTの場合、指定されたIDの情報を変更する。
     * 
     * @param req
     * @param resp 
     */
    public void doBusinessLogic(HttpServletRequest req, HttpServletResponse resp){
                
        String iGetPost = req.getMethod();
        UsersDao dao = new UsersDao();
        
        if(iGetPost.equals("GET")){
            
            String updateId = req.getParameter("id");
            List<TableUsers> result = dao.findById(updateId);
            req.setAttribute("result", result);
        }
    }
}
