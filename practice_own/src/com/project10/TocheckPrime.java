package com.project10;

public class TocheckPrime {

	public static void main(String[] args) {
		
		int num=1;
		
		boolean yeah=isPrime(num);
		
		
		if(yeah){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
		
}
	public  static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
				return false;
			}
		}
		return true;
		}
}
