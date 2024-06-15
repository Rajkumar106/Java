package com.raj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.imple.ServiceImple;

import com.raj.demo.model.Sample;

@RestController
public class ControllerDemo {
	
	@Autowired
	ServiceImple imp;
	
	@GetMapping("/datasofsample")
	public  List<Sample> datas(){
		List<Sample> sampleDetails = imp.getSampleDetails();
		return sampleDetails;
		
	}

}
