package com.raj.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.raj.demo.entity.Employee;
import com.raj.demo.repository.EmpRepository;


@Service
public class ServiceClass{
	
	@Autowired
	EmpRepository empRepository;
	
	public Employee saveData(Employee employee) {
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		
		return empRepository.save(employee);
		
	}
	
	

}
