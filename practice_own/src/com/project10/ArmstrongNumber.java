package com.project10;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num=153;
		int arm=0;
		int num1=num;
		int count=3;
		
		while (num!=0) {
		int digit=num%10;
		arm+=(int)Math.pow(digit, count);
		num=num/10;
		}
		
		System.out.println("The arm is : "+ arm);
		
//		while (num1!=0) {
//			System.out.println(num);
//			num=num/10;
//			
//			count+=1;
//		}
//		
//		System.out.println(count);
		
	}

}
