/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire_shop.dao.custom;

import carhire_shop.dao.SuperDao;
import carhire_shop.entity.CustomerEntity;

/**
 *
 * @author USER
 */
public interface CustomerDao extends SuperDao{
    Boolean addCustomer(CustomerEntity customerEntity) throws Exception;
}
