package com.raj.demo.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raj.demo.model.Sample;
import com.raj.demo.repository.SampleRepo;
import com.raj.demo.service.ServiceDemo;

@Component
public class ServiceImple implements ServiceDemo {

	@Autowired
	SampleRepo repo;
	
	@Override
	public List<Sample> getSampleDetails() {
		List<Sample> all = repo.findAll();
		
		return all;
	}
	
	

}
