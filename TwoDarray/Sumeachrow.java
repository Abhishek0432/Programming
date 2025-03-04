package com.TwoDarray;

public class Sumeachrow {

	public static void main(String[] args) {
		int [][]arr = {{10,20,30},{40,50,60},{70,80,90}};
		for (int row = 0; row < arr.length; row++) {
			int sum=0;
			for (int col = 0; col < arr.length; col++) {
				sum += arr[row][col];
			}
			System.out.println(sum);
		}

	}

}
