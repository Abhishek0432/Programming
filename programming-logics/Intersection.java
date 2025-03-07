package com.Jspiders.Jft;

public class Intersection {
	   public static void main(String args[]) {
//	      int myArray1[] = {23, 36, 96, 78, 55};
//	      int myArray2[] = {78, 45, 19, 73, 55};
//	      System.out.println("Intersection of the two arrays ::");
//	     
//	      for(int i = 0; i<myArray1.length; i++ )
//	      {
//	         for(int j = 0; j<myArray2.length; j++)
//	         {
//	            if(myArray1[i]==myArray2[j])
//	            {
//	               System.out.println(myArray2[j]);
//	            }
//	         }
//	      }
		   int arr1[] = {1,2,3,4};
		   int arr2[] = {6,7,8,9};
		   System.out.println("intersection of two arrays:");
		   for (int i = 0; i < arr1.length; i++) {
			   for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
				
		}
		   System.out.println("no common elements:");
	   }
	}