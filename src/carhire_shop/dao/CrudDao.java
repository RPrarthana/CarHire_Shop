/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire_shop.dao;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface CrudDao<T, ID> extends SuperDao {

    //crud operations 5 methods
    boolean add(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(ID id) throws Exception;

    Object get(ID id) throws Exception;

    ArrayList<Object> getAll() throws Exception;

}
