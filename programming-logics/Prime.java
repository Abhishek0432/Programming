package com.Jspiders.Jft;

public class Prime {

	public static void main(String[] args) {
		int no = 1;
		boolean flag=true;
		if(no < 2)
		{
			System.out.println(no + "not prime");
		}
		else
		{
			for(int i=2;i<=Math.sqrt(no);i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
		}
	
		if(flag) {
			System.out.println(no + "is prime");
		}
		else {
			System.out.println(no + "is nott prime");
		}
	}

}
