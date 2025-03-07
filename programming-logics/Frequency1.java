package com.Jspiders.Jft;

public class Frequency1 {

	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,5};
		int[] arr2 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			int no = arr1[i];
			arr2[no]++;
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]!=0) {
				System.out.println(i+" "+arr2[i]);
			}
		}
	}

}
