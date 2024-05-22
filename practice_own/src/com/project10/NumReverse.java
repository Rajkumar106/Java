package com.project10;

public class NumReverse {
	public static void main(String[] args) {
		int num=1000;
		int temp=0;
		while(num>0) {
			int digit=num%10; // Extract last digit
			//temp=temp*10+digit; //
			num=num/10;
			System.out.print(digit);
			
		}
		
		//System.out.println(" "+ temp);
	}
}
