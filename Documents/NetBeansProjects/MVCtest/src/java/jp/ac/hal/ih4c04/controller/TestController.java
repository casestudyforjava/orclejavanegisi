/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ih4c04.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yuta
 */
@WebServlet("/MVCtest/*")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        String LIST = "http://localhost:8080/MVCtest/MVCtest/list";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String URL = new String(request.getRequestURL());
        if(URL.equals(LIST)){
            ServletContext sc = getServletContext();
            RequestDispatcher reqdis = sc.getRequestDispatcher("/list.jsp");
            request.setAttribute("selectName", "");
            reqdis.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
