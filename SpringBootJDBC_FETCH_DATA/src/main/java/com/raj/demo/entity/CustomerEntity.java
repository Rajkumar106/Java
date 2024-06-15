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
@Table(name = "CUSTOMER")
public class CustomerEntity {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	private int id;
	
	@Column(name = "CUSTOMER_NAME")
	private String name ;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "ZIP_CODE")
	private String zip;
	
	
	

}
