package com.raj.demo.forImplementation;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.raj.demo.service.StudService;
import com.raj.demo.student.StudentDetails;


@Component
public class ForImplementation implements StudService {

	@Override
	public StudentDetails getStudentDetails() {
		ArrayList<String> lst=new ArrayList<>();
		lst.add("mango");
		lst.add("apple");
		lst.add("grapes");
		
		StudentDetails s=new StudentDetails("Bharani", 99, lst);
		
		return s;
	}
	
}
