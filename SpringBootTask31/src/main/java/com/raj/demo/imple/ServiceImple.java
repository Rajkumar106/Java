package com.raj.demo.imple;

import org.springframework.stereotype.Component;

import com.raj.demo.modelClass1.School;
import com.raj.demo.modelClass1.Student;
import com.raj.demo.servicedemo.ServiceClass;


@Component
public class ServiceImple implements ServiceClass{

	@Override
	public Student getStudDetails() {
		Student stud= new Student("Raj", 24, "abc@gmail.com");
		return stud;
	}

	@Override
	public School getSclDetails() {
		School schl=new School("SRM", 1304, "Chennai");
		return schl;
	}

}
