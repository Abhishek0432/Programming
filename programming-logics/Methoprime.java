package com.Jspiders.Jft;
 import java.util.Scanner;
public class Methoprime {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String x = isPrime(no);
		System.out.println(x);

	}
	static String isPrime(int no)
	{
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
			return (no+"isprme");
		}
		else {
			return(no+"is not prime");
		}
		
	}

}
