/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire_shop.dao.custom.impl;

import carhire_shop.dao.CrudUtill;
import carhire_shop.dao.custom.CustomerDao;
import carhire_shop.entity.CustomerEntity;
import java.util.ArrayList;

import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtill.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)",
        t.getId(), t.getTitile(), t.getName(), t.getDob(),
        t.getSalary(),t.getAddress(), t.getCity(), t.getProvince(), t.getZip());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
       return CrudUtill.executeUpdate("UPDATE Customer SET CustTitle =? CustNames?, DOB=?, salary = 7, CustAddress=7, City=?, Provinces?, PostalCode=7 WHERE CustID=?",
        t.getTitile(), t.getName(), t.getDob(),
        t.getSalary(),t.getAddress(), t.getCity(), t.getProvince(), t.getZip(),  t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtill.executeUpdate("DELETE FROM Customer WHERE CustID=?",
        id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
       ResultSet rst = CrudUtill.executeQuery("Select * FROM Customer WHERE CustID = ?", id);
       
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2), 
                    rst.getString(3),
                    rst.getString(4), 
                    rst.getDouble(5),
                    rst.getString(6), 
                    rst.getString(7),
                    rst.getString(8), 
                    rst.getString(9));
            
            return customerEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtill.executeQuery("Select * FROM Customer = ?");
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2), 
                    rst.getString(3),
                    rst.getString(4), 
                    rst.getDouble(5),
                    rst.getString(6), 
                    rst.getString(7),
                    rst.getString(8), 
                    rst.getString(9));
            
            customerEntitys.add(customerEntity);
        }
        
       return customerEntitys;
    }
}
