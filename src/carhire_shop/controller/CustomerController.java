/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire_shop.controller;

import carhire_shop.dto.CustomerGto;
import carhire_shop.service.ServiceFactory;
import carhire_shop.service.custom.CustomerService;

/**
 *
 * @author USER
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerGto customerGto) throws Exception {
        return customerService.addCustomer(customerGto);
    }
}
