package com.Jspiders.Jft;

public class Secndmin {

    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 6, 2, 4, 5, 9, 12};

        int min = arr[0];        // Assume the first element is the minimum
        int secondMin = Integer.MAX_VALUE;     // Start with the largest possible value

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;       // Update second min before changing min
                min = arr[i];           // Update min
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];      // Update second min if it's smaller than current second min
            }
        }

        System.out.println("The second minimum element is: " + secondMin);
    }
}

