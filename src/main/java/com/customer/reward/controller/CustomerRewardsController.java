package com.customer.reward.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.reward.domain.Reward;
import com.customer.reward.entity.Customer;
import com.customer.reward.service.CustomerRewardsService;
import com.customer.reward.service.CustomerService;

import lombok.CustomLog;

@RestController
@RequestMapping("/customers/rewards")
public class CustomerRewardsController {

    @Autowired
    CustomerRewardsService customerRewardsService;
    
    @Autowired
    CustomerService customerService;

    

    @GetMapping(value = "/{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Reward> getRewardsByCustomerId(@PathVariable("customerId") Long customerId){
        Customer customer = customerService.findByCustomerId(customerId);
        if(customer == null)
        {
        	throw new RuntimeException("Invalid / Missing customer Id ");
        }
        Reward customerRewards = customerRewardsService.getRewardsByCustomerId(customerId);
        return new ResponseEntity<>(customerRewards,HttpStatus.OK);
    }
    

}
