package com.project10;

import java.util.*;


public class Palindrome{
	
	private boolean isPalindrome() {
		String s="anna";
		int len=s.length();
		
		int i;
		for ( i=0;i<len/2;i++)
		{
			
			if (s.charAt(i)!=s.charAt(len-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrome ss=new Palindrome();
		boolean result =ss.isPalindrome();
		System.out.println(result);
	}

}
