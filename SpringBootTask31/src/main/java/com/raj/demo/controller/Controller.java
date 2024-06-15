package com.raj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.imple.ServiceImple;
import com.raj.demo.modelClass1.School;

@RestController
public class Controller {
	
	@Autowired
	ServiceImple imp;
	
	@GetMapping("/valuesof")
	public ResponseEntity<?> getSchlDetails() {
		return new ResponseEntity<School>(imp.getSclDetails(), HttpStatus.ACCEPTED);
		
	}

}
