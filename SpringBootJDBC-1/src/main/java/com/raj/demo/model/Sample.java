package com.raj.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sample {
	
	@Column(name = "NAME")
	private String name;
	
	@Id
	@Column(name = "ID")
	private int id; 
	
	
}
