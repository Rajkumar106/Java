package com.raj.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Student")
public class Student {
	
	@Id
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "DEPARTMENT")
	private String department;
	
	
	
	

}
