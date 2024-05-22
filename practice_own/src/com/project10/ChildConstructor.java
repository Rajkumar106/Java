package com.project10;

public class ChildConstructor extends ConstructorParent {
	
	public ChildConstructor(){
		this(10,"June");		
		System.out.println("Child Default");
	}
	public ChildConstructor(int date,String month) {
		
		super();
		System.out.println(date +" "+month );
	}
	public static void main(String[] args) {
		ChildConstructor c=new ChildConstructor();
	}

}
