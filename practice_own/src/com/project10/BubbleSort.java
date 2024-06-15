package com.project10;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {5, 2, 8, 3, 1, 7};
		
		int len = arr.length-1;
		
		for(int i=0;i<=len;i++) 
		{
			for(int j=0;j<len;j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
