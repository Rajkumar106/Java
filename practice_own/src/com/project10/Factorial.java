package com.project10;

public class Factorial {
	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(fact);
		
	}
}
