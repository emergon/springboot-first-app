package com.emergon.controller;

import com.emergon.entities.Customer;
import com.emergon.service.CustomerService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    CustomerService service;
    
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") int id){
        Customer c = service.findById(id);
        return c;
    }
    
    @GetMapping
    public List<Customer> getCustomers(){
        List<Customer> list = service.findAll();
        return list;
    }
    @GetMapping("/name/{name}")
    public List<Customer> getCustomersByName(@PathVariable("name") String name){
        List<Customer> list = service.getCustomersByName(name);
        return list;
    }
    
}
