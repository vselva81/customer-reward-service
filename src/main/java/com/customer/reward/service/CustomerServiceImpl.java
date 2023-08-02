package com.customer.reward.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.reward.entity.Customer;
import com.customer.reward.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository ;
	
	public Customer findByCustomerId(Long customerId) {
		return customerRepository.findByCustomerId(customerId);
	}
	
	public List<Customer> findAll(){
		List<Customer> target = new ArrayList<>();
		Iterable<Customer> customers = customerRepository.findAll();
		if(customers!=null){
			for( Customer customer: customers) {
				target.add(customer);
			}
		}
		return target;
	}

}
