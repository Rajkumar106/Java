package com.project10;

public class FibonacciRecursion {
	
	private static long fibonacciSeriesOf(long num) {
		if (num<=1)
			return num;
		else
			return fibonacciSeriesOf(num-1)+fibonacciSeriesOf(num-2);
	}
	
	public static void main(String[] args) {
		//fibonacciSeriesOf();
		long range=30;
		for (long i=0;i<=range;i++) {
			System.out.print(fibonacciSeriesOf(i)+" ");
		}
	}

	
}
