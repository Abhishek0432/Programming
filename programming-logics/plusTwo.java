package com.Jspiders.Jft;

import java.util.Arrays;

public class plusTwo {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		int[] temp = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, temp, 0, arr1.length);
		System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
		System.out.println(Arrays.toString(temp));
	}

}
