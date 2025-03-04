package com.TwoDarray;

public class Minsumtwodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{7,3,1,2},{4,8,6,3},{5,3,1,7},{9,8,7,1}};
		MinArray(arr);
	}
	public static void MinArray(int[][]arr)
	{
		int min=Integer.MAX_VALUE;
		for(int r=0;r<arr.length;r++)
		{
			int sum=0;
			for(int c=0;c<arr[r].length;c++)
			{
				sum=sum+arr[r][c];
			}
			if(sum<min)
			{
				min=sum;
			}
		}
		System.out.println(min);

	}

}
