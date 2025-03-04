package com.TwoDarray;
//find max and mini and do sums
public class SumMinMaxTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{7,3,1,2},{4,8,6,3},{5,3,1,7},{9,8,7,1}};
		sumMinMax(arr);
	}
	public static void sumMinMax(int[][]arr)
	{
		
		for(int r=0;r<arr.length;r++)
		{
			int min=Integer.MAX_VALUE;
			int max=0;
			int sum=0;
			for(int c=0;c<arr[r].length;c++)
			{
				if(arr[r][c]>max)
				{
					max=arr[r][c];
				}
				if(arr[r][c]<min)
				{
					min=arr[r][c];
				}
			}
			System.out.println("minimum "+ min+" maximun "+max);
			System.out.println(sum+=max+min);
		}
	}

}
