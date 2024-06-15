package com.raj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Home {
	private String name;
	private int rollNo;
	
	@Autowired
	private Connection modem;
	
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void connect() {
		modem.connectivity();
		System.out.println("Connected to network");
	}

}
