package com.project10;

public class Bharani {
	public static void main(String[] args) {
        int[] arr = {20, 30, 40, 10, 55,60};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
		
	
	
} 