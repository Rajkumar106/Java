package com.project10;

public class FibonacciPractice {
	public static void main(String[] args) {
		int num=0;
		int num1=1;
		System.out.print(num+" "+num1+" ");
		for (int i=0;i<=10;i++) {
			int num3=num+num1;
			num=num1;
			num1=num3;
			//num1++;
			System.out.print(num3+" ");
		}
	}
	
}
