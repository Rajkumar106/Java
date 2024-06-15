package com.raj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.Entity.Customer;
import com.raj.demo.service.CustService;

@RestController
public class CustController {
	
	@Autowired
	CustService service;
	
	@GetMapping("/gettingData")
	public List<Customer> getting() {
		return service.getDatas();
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleting(@PathVariable int id) {
		return service.deleteData(id);
		
	}

}
