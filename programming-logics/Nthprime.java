package com.Jspiders.Jft;

public class Nthprime {

	public static void main(String[] args) {
	 int n=13;
	 int count = 0;
	 for(int j=2;j<=100;j++)
	 {
		 int no=j;
	
		 boolean flag = true;
		 for(int i=2;i<=Math.sqrt(no);i++)
		 {
			 if(no%i==0)
			 {
				 flag=false;
				 break;
			 }
		 }
		 if(flag) {
			 count++;
			 if(count==n)
			 {
				 System.out.println(no+"is prime");
				 break;
			 }
		 }
		 	 
	 }
	}

}
