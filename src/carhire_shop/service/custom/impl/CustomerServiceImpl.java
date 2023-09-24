/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carhire_shop.service.custom.impl;

import carhire_shop.dao.DaoFactory;
import carhire_shop.dto.CustomerGto;
import carhire_shop.entity.CustomerEntity;
import carhire_shop.service.custom.CustomerService;

/**
 *
 * @author USER
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerGto customerGto = (CustomerGto) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    public String addCustomer(CustomerGto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitile(),
                dto.getName(), dto.getDob(), dto.getSalary(),
                dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerGto.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

}
