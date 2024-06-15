package com.raj.demo.service;

import org.springframework.stereotype.Service;

import com.raj.demo.student.StudentDetails;

@Service
public interface StudService {
	
	StudentDetails getStudentDetails();

}
