package com.Jspiders.Jft;

public class Maxx {

	public static void main(String[] args) {
		int[] arr= {1,8,3,6,2,4,5,9,12};
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				{
					max = arr[i];
				}
			}
		
		System.out.println(max);

	}

}
