package com.Jspiders.Jft;

public class Primerange {

	public static void main(String[] args) {
			 
	 
		   for(int j=2;j<=100;j++)
		   {
			   int no=j;
			   boolean flag=true;
				 
			   for(int i=2;i<=Math.sqrt(no);i++)
			   {
				   if(no%i==0)
				   {
					   flag=false;
					   break;
				   }
			   }
		   
	   
			   if(flag)
			   {
				   System.out.println(no+ "is prime");
				   
			   }
			 
		   }
	}

}
