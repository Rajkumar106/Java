package com.demo_maven;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Abcd {
	public String name;
	public int rollNo;
	public String college;
	public String department;
	public String district;
	
	public static void main(String[] args) {
		Abcd a=new Abcd();
		a.setName("Rajkumar");
		a.setRollNo(1234);
		a.setCollege("SRM");
		a.setDepartment("CSE");
		a.setDistrict("Thiruvallur");
		
		String studName =a.getName();
		System.out.println(studName);
		
		int studRoll=a.getRollNo();
		System.out.println(studRoll);
		
		String colgName=a.getCollege();
		System.out.println(colgName);
		
		String deptName=a.getDepartment();
		System.out.println(deptName);
		
		String distName=a.getDistrict();
		System.out.println(distName);
	}
	
}
