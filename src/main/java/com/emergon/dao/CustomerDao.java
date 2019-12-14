package com.emergon.dao;

import com.emergon.entities.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{
       
    @Query("Select c from Customer c where c.cname = :name")
    List<Customer> getCustomersByName(@Param("name") String name);
    
    
}
