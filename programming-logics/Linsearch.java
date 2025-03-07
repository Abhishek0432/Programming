package com.Jspiders.Jft;

public class Linsearch {

	public static void main(String[] args) {
		int[]arr= {10,5,7,4,3,3,4,5,6};
		int search = 4;
		linearsearch(arr,search);

	}
	static void linearsearch(int[]arr,int search) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==search) {
				System.out.println("search eleme "+search+"present at index"+i);
				return;
			}
		}
		System.out.println("search eleme is not present");
	}
	
}
