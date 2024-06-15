package com.project10;

public class FibonacciInRecursion {
	
	public static void main(String[] args) {
		
		int num=10;
		
		System.out.println("The f-series for "+num+" is :");
		
		for(int i=0;i<=num;i++) {
			System.out.print(fibonacci(i)+" ");
			
		}
		
	}

	private static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	

}
