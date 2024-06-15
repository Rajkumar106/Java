package com.project10;

public class ReverseNum {
	
	public static void main(String[] args) {
		
		int num=52045;
		
		int reversedNum=0;
		int numm=1236;
		
		while(num!=0) {
			int digit = num%10;
			reversedNum = reversedNum*10 + digit;
			num=num/10;
			System.out.print(digit); //handles if last digit is 0

		}
		System.out.println((int)Math.log10(numm)+1);
		
		System.out.println(reversedNum);
		
	}

}
