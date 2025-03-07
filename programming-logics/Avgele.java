package com.Jspiders.Jft;

public class Avgele {

	public static void main(String[] args) {
		int [] arr = {10,3,4,6,7,9};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum/arr.length);

	}

}
