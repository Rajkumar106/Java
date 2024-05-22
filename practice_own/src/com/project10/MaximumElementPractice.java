package com.project10;

public class MaximumElementPractice {
	public static int count(int n,int arr[]) {
		int countt=0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				countt++;
			}
		}
		return countt;
	}
	public static void main(String[] args) {
		int[] arr= {1,7,4,6,7,3,4,7,4,7};
		int max=arr[0];
		int maxcount=0;
		for(int i=0;i<arr.length;i++) {
			if(count(arr[i],arr)>maxcount) {
			maxcount=count(arr[i],arr);
			max=arr[i];}
		}
		System.out.println(max);
	}	
}
