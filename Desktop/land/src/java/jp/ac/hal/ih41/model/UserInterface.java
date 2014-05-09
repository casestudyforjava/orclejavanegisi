/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ih41.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 業務ロジックを表すインターフェース
 * 
 * @author kiaamaaio
 */
public interface UserInterface {
    
    /**
     * 各種業務ロジックを実行する
     */
    public void doBusinessLogic(HttpServletRequest req, HttpServletResponse resp);
}
