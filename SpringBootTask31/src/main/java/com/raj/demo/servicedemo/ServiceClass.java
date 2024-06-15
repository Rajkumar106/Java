package com.raj.demo.servicedemo;

import org.springframework.stereotype.Service;

import com.raj.demo.modelClass1.School;
import com.raj.demo.modelClass1.Student;

@Service
public interface ServiceClass {
	
	Student getStudDetails();
	School getSclDetails();
	

}
