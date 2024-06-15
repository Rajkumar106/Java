package com.raj.demo.forContol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.raj.demo.forImplementation.ForImplementation;
import com.raj.demo.student.StudentDetails;

@RestController
public class ForControl {
	
	@Autowired
	ForImplementation imp;
	
	@GetMapping("/stud/{id}")
	public StudentDetails returning(@PathVariable int id ) {
			StudentDetails studentDetails = imp.getStudentDetails();
			return studentDetails;
			}
}


