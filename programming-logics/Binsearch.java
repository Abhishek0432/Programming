package com.Jspiders.Jft;

import java.util.Arrays;

public class Binsearch {

	public static void main(String[] args) {
		int [] arr = {10,3,4,1,68,89};
		Arrays.sort(arr);
		int search = 4;
		System.out.println(Arrays.binarySearch(arr,search));

	}

}
