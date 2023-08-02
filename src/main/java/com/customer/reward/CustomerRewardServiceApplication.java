package com.customer.reward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan("com.customer.reward.entity")
@SpringBootApplication
public class CustomerRewardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRewardServiceApplication.class, args);
	}

}
