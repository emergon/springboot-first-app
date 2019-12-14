package com.emergon.service;

import com.emergon.dao.CustomerDao;
import com.emergon.entities.Customer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDao cdao;
    
    @Override
    public List<Customer> findAll() {
        return cdao.findAll();
    }

    @Override
    public Customer findById(int id) {
        Optional<Customer> result = cdao.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        return null;
    }

    @Override
    public void save(Customer p) {
        cdao.save(p);
    }

    @Override
    public int deleteById(int id) {
        cdao.deleteById(id);
        return 1;
    }

    @Override
    public List<Customer> getCustomersByName(String name) {
        return cdao.getCustomersByName(name);
    }
    
}
