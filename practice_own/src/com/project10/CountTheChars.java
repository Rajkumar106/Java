package com.project10;

public class CountTheChars {
	public static void main(String[] args) {
		
		String s="AJI2345678ajichan";
		
		int upper =0;
		int lower =0;
		int nums =0;
		
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			if (c>=65 && c<=90)
				upper+=1;
			else if(c>=97 && c<=122)
				lower+=1;
			else if(c>=48 && c<=57)
				nums+=1;
		}
		System.out.println("Count of upperCase: "+upper);
		System.out.println("Count of lowerCase: "+lower);
		System.out.println("Count of Numeric: "+nums);

	}
}
