package com.raj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.entity.Employee;
import com.raj.demo.service.ServiceClass;

@RestController
public class ControllerClass {
	
	@Autowired
	ServiceClass serviceClass;
	
	@PostMapping("/doneposting")
	public Employee getData(@RequestBody Employee employee) {
		return serviceClass.saveData(employee);
		
	}

}
