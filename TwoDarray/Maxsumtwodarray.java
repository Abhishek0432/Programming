package com.TwoDarray;

public class Maxsumtwodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{7,3,1,2},{4,8,6,3},{5,3,1,7},{9,8,7,1}};
		MaxArray(arr);
	}
	public static void MaxArray(int[][]arr)
	{
		int max=0;
		for(int r=0;r<arr.length;r++)
		{
			int sum=0;
			for(int c=0;c<arr[r].length;c++)
			{
				sum+=arr[r][c];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
	}

}
