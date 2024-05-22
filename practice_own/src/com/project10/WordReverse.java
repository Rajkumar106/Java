package com.project10;

import java.util.*;

public class WordReverse {
	public static void main(String[] args) {
		
		String sentence="welcome to java";
		String newStr[]=sentence.split(" ");
		List<String> lst=new ArrayList<>();
		
		for (int i=newStr.length-1;i>=0;i--) 
		{
			lst.add(newStr[i]);
		}
		
		String res=String.join(" ", lst);
		System.out.println(res);
	}
}