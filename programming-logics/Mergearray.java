package com.Jspiders.Jft;

import java.util.Arrays;

public class Mergearray {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40};
		int arr2[] = {50,60,70,80};
		int a=arr1.length;
		int b=arr2.length;
		int c = a+b;
		int arr3[] = new int[c];
		System.arraycopy(arr1, 0, arr3, 0, a);
		System.arraycopy(arr2, 0, arr3, a, b);
		System.out.println(" "+Arrays.toString(arr3));

	}

}
