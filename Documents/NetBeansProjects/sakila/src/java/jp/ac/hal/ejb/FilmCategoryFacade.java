/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jp.ac.hal.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jp.ac.hal.entity.FilmCategory;

/**
 *
 * @author yuta
 */
@Stateless
public class FilmCategoryFacade extends AbstractFacade<FilmCategory> {
    @PersistenceContext(unitName = "sakilaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FilmCategoryFacade() {
        super(FilmCategory.class);
    }
    
}
