package com.Jspiders.Jft;

public class Minn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {34,0,1, 8, 3, 6, 2, 4, 5, 9, 12};
	        int min = arr[0]; // Initialize with the first element of the array
	       // System.out.println("before For Loop");
	        for (int i = 1; i < arr.length; i++) {
	        	//System.out.println("into the for loop");
	            if (arr[i] < min) {
	            	//System.out.println("into the if");
	                min = arr[i];
	            }
	        }
	        System.out.println(min);
	}
}
