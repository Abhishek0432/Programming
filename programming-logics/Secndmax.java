package com.Jspiders.Jft;

public class Secndmax {

	public static void main(String[] args) {
		int[] arr= {44,1,8,3,6,2,4,5,9,12};
		int max = 0;
		int Secondmax = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				{
					Secondmax = max;
					max = arr[i];
				}
				else if(arr[i]>Secondmax) {
				Secondmax = arr[i];
			}
			
		}
		
		System.out.println(Secondmax);
	}

}
