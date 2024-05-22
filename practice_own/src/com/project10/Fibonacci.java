package com.project10;

public class Fibonacci {
	
	public static int fib(int x) {
		if(x<=1) return 1;
		
		int res = fib(x-1) + fib(x-2);
		
		return res;
	}
	public static void main(String[] args) {
		
		int n = fib(5);
		
		System.out.println(n);
	}

}
