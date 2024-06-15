package com.raj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.entity.Student;
import com.raj.demo.service.StudentService;

@RestController
public class Controller {
	
	@Autowired
	StudentService service;
	
	
	@GetMapping("/gettingData")
	public List<Student> getStudentData(){
		return service.getStudentDetails();
		
	}
	
	
	@PutMapping("/updatingData")
	public Student getUpdatedData(@RequestBody Student student) {
		return service.updateDetails(student);
		
	}

}
