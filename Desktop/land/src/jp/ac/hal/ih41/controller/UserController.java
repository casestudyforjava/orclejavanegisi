
package jp.ac.hal.ih41.controller;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jp.ac.hal.ih41.model.UserIndexModel;
import jp.ac.hal.ih41.model.UserInterface;
import jp.ac.hal.ih41.model.UserListModel;
import jp.ac.hal.ih41.model.UserUpdateModel;

/**
 *
 * @author kiaamaaio 
 */
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doService(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doService(request, response);
    }
    
    protected void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        /*===================================
         * ページのURIを入れる
         *===================================*/
	String page = request.getRequestURI();
        
        /*===================================
         * ページに応じて、jspとmodelを選択する。
         *===================================*/
        String jsp = pageJsp(page);
        UserInterface model = pageModel(page);
        
        /*===================================
         * ページに応じて、処理を実行する。
         *===================================*/
	model.doBusinessLogic(request, response);

	/*===================================
         * フォワード
         *===================================*/
        RequestDispatcher rd = request.getRequestDispatcher(jsp);
	rd.forward(request, response);
        
    }
    
    /**
     * 指定されたページのJspを返す。
     * 
     * @param key
     * @return 
     */
    private String pageJsp(String key){
        
        HashMap pageJspMap = new HashMap();
        pageJspMap.put("/land/user/", "/WEB-INF/jsp/index.jsp");
        pageJspMap.put("/land/user/list", "/WEB-INF/jsp/list.jsp");
        pageJspMap.put("/land/user/update", "/WEB-INF/jsp/update.jsp");
        
        return (String)pageJspMap.get(key);
    }
    
    /**
     * 指定されたページのModelを返す。
     * 
     * @param key
     * @return 
     */
    private UserInterface pageModel(String key){
        
        HashMap pageModelMap = new HashMap();
        pageModelMap.put("/land/user/", new UserIndexModel());
        pageModelMap.put("/land/user/list", new UserListModel());
        pageModelMap.put("/land/user/update", new UserUpdateModel());
        
        return (UserInterface)pageModelMap.get(key);
    }
}
