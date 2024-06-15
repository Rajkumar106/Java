package com.raj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.entity.CustomerEntity;
import com.raj.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/getCustomerData")
	public List<CustomerEntity> gettingAllData(){
		return customerService.getDetails();
		
	}

}
