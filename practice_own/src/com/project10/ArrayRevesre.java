package com.project10;
import java.util.*;

public class ArrayRevesre {
	public static void main(String[] args) {
		
		int[] arr= {567,23,45,67,99};
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
