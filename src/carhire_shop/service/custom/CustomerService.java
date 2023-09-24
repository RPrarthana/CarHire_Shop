/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire_shop.service.custom;

import carhire_shop.dao.custom.CustomerDao;
import carhire_shop.dto.CustomerGto;
import carhire_shop.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface CustomerService extends SuperService {

    String addCustomer(CustomerGto customerGto) throws Exception;

    String updateCustomer(CustomerGto customerGto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    CustomerGto getAllCustomer(String id) throws Exception;

    ArrayList<CustomerGto> getCustomer() throws Exception;

}
