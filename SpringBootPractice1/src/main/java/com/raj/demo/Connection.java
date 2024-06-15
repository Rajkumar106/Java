package com.raj.demo;

import org.springframework.stereotype.Component;

import lombok.*;

@Setter
@Getter

@Component
public class Connection {
	
	private String name;
	private int id;
	
	public void connectivity() {
		System.out.println("Connecting to network...");
	}
	

}
