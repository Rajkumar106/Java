package com.project10;

public class BharaniTask1 {
    public static void main(String[] args) {
        String str = "5689-+-"; // Input string
        int len = str.length(); // Length of the input string
        int result = Character.getNumericValue(str.charAt(0)); // Initialize result with the numeric value of the first character

        for (int i = 1, j = len / 2; i < len / 2; i++, j++) {
            int ele1 = Character.getNumericValue(str.charAt(i));
            char operator = str.charAt(j);

            if (operator == '+') {
                result += ele1; 
            } else if (operator == '-') {
                result -= ele1;
            } else if (operator == '*') {

           } //else {
//                System.out.println("Invalid operator: " + operator);
//            }
        }
        System.out.println(result);
    }
}

