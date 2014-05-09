/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ih4c04.entity;

import java.util.Date;


/**
 *
 * @author yuta
 */
public class CountryEntity {
    
    private int country_id;
    
    private String country;
    
    private Date last_update;

    //右クリ→リファクタリング→フィールドのカプセル化
    /**
     * @return the country_id
     */
    public int getCountry_id() {
        return country_id;
    }

    /**
     * @param country_id the country_id to set
     */
    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the last_update
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * @param last_update the last_update to set
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
    
}
