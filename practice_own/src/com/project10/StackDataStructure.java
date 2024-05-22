package com.project10;

import java.util.*;

public class StackDataStructure {
	
	static int stackList[]=new int[10];
	static int position=-1;
	
	//for adding the number to list
	public  void push(int i) {
		if (position<=9)
			stackList[++position]=i;
		else
			System.out.println("The stack is full");
	}
	
	//for removing the last element
	public int pop() {
		if (position>=0) {
			return stackList[position--];}
		else
			System.out.println("The stack is empty");
			return -1;
	}
	
	public static void main(String[] args) {
		
		StackDataStructure s=new StackDataStructure();
		s.push(10);
		s.push(20);
		s.push(35);
		System.out.println(s.pop());
		System.out.println(Arrays.toString(stackList));
		s.push(44);
		System.out.println(Arrays.toString(stackList));
		
	}
}
