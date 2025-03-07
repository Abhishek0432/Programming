package com.Jspiders.Jft;

public class Thirdmax {

	public static void main(String[] args) {
		int[] arr= {44,1,8,3,6,2,4,33,5,9,12};
		int max = 0;
		int Secondmax = 0;
		int thirdmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				{
					Secondmax = max;
					max = arr[i];
			}
					else if(arr[i]>Secondmax) {
						thirdmax =Secondmax;	
						Secondmax = arr[i];
				
			}
					else if(arr[i]>thirdmax) {
						thirdmax = arr[i];
						
					}
			
			}
		
		System.out.println(thirdmax);
	}
}
