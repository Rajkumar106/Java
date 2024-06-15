package com.raj.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raj.demo.model.Sample;

@Service
public interface ServiceDemo {
	
	List<Sample> getSampleDetails();

}
