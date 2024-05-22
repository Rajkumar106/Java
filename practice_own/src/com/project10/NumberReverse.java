package com.project10;

public class NumberReverse {
	public static void main(String[] args) {
		
		int num=7896;
		int newNum=0;
		while(num>0) {
			int x = num%10;
			newNum = newNum*10 + x;
			num = num/10;
		}
		System.out.println(newNum);
	}
}
