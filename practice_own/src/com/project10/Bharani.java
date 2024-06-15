package com.project10;

import java.util.ArrayList;

public class Bharani {
	public static void main(String[] args) {
        int[] arr = {5, 2,4, 3,1};
        StringBuilder result = new StringBuilder("Raj");
        result.reverse();
        System.out.println(result);
        
        int rows=5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        
        
	} } 
}
        