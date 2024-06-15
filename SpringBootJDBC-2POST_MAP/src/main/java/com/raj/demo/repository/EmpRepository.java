package com.raj.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.demo.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {
	

}
