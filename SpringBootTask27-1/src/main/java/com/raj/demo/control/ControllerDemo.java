package com.raj.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.implementation.Implementationx;

@RestController
public class ControllerDemo {
	
	@Autowired
	Implementationx imp;
	
	@GetMapping("/value")
	public String returning() {
		return imp.name();
	}
	
}
