package com.emergon.service;

import com.emergon.entities.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> getCustomersByName(String name);
    
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer p);

    int deleteById(int id);
}
