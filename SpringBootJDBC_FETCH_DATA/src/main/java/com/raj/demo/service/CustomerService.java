package com.raj.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.demo.entity.CustomerEntity;
import com.raj.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<CustomerEntity> getDetails(){
		return customerRepository.findAll();
		
	}

}
