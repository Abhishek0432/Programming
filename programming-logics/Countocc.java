package com.Jspiders.Jft;

public class Countocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,3,2,3,2,4,5,6,7};
		int n=2;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println("the value is present " + count + " times");

	}

}
