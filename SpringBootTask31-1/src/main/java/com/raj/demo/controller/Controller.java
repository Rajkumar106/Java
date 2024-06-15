package com.raj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.modelclass.ModelClass;
import com.raj.demo.serviceimplementation.Implementation;

@RestController
public class Controller {
	
	 @Autowired
	 Implementation imp;
	 
	 
	 @PostMapping("/datas")
	 public ModelClass displayDetails(@RequestBody ModelClass v) {
		 
		System.out.println(v.getName());
		System.out.println(v.getRollNo());
		System.out.println(v.getLocation());
		
		return v;
		 
	 }
	 

}
