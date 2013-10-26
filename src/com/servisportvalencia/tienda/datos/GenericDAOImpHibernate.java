/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servisportvalencia.tienda.datos;

import java.util.List;

/**
 *
 * @author KiKe
 */
public interface GenericDAOImpHibernate <T, ID>{ 
    public T read(ID id);
    public void insert (T t);    
    public void update (T t);
    public void delete (ID id);
    public List<T> findAll();
}
