package com.customer.reward.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.reward.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
    
}
