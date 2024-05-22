package com.project10;

public class SampleForEncapulation { //user or Inner
	//private String name
	public static void main(String[] args) {
		EncapsulationPractice1 ee =new EncapsulationPractice1();
		ee.setName("Vivo");
		System.out.println(ee.getName());
		ee.setAge(20);
		System.out.println(ee.getAge());
	}
	
	
}
