package com.customer.reward.service;

import java.util.List;

import com.customer.reward.entity.Customer;

public interface CustomerService {
	public Customer findByCustomerId(Long customerId);
	public List<Customer> findAll();
}
