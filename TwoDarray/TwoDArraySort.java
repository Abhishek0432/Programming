package com.TwoDarray;

import java.util.Arrays;

public class TwoDArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{7,3,1,2},{9,8,6,3},{5,3,1,2},{9,8,7,1}};
		sort(arr);
	}
	public static void sort(int[] []arr)
	{
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				Arrays.sort(arr[r]);
			}
			System.out.println(Arrays.toString(arr[r]));
		}
	}

}
