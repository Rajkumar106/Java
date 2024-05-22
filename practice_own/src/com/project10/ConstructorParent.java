package com.project10;

public class ConstructorParent { //parent class
	public ConstructorParent() {
		this("Parameterized constructor");
		System.out.println("Iam Non-parameterized or Default constructor");
	}
	public ConstructorParent(String name){
		System.out.println("My Name is "+name);
	}

//	public static void main(String[] args) {
//		ConstructorParent p=new ConstructorParent();
//	}

}
