package com.raj.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.demo.Repository.StudentRepo;
import com.raj.demo.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
	public List<Student> getStudentDetails(){
		return repo.findAll();
	}
	
	public Student updateDetails(Student student) {
		Student updateStudent = repo.findById(student.getName()).orElse(null);
		
		if(updateStudent!=null) {
			updateStudent.setName(student.getName());
			updateStudent.setAge(student.getAge());
			updateStudent.setDepartment(student.getDepartment());
			return repo.save(updateStudent);
		}
		return null;
	}

}
