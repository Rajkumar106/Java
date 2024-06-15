package com.raj.demo.student;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDetails {
	
	private String name;
	private int id;
	private ArrayList<String> arr;

}
