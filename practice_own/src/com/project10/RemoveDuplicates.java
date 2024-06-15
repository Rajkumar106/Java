package com.project10;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str="malayalam";
		String newStr="";
		
		HashSet val=new HashSet();
		
		for(int i=0;i<str.length();i++) {
			if(!val.contains(str.charAt(i))) {
				val.add(str.charAt(i));
				newStr+=str.charAt(i);
			}
		}
		System.out.println(newStr + str);
	}
}
