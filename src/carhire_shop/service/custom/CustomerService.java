/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carhire_shop.service.custom;

import carhire_shop.dto.CustomerGto;
import carhire_shop.service.SuperService;

/**
 *
 * @author USER
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerGto customerGto) throws Exception;
}
