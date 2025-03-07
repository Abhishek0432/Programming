package com.Jspiders.Jft;
import java.util.Scanner;
public class Rangeprime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("enter the starting range:");
		int start = sc.nextInt();
		System.out.print("enter the number end:");
		int end = sc.nextInt();
		
		String str = rangPrime(start,end);
		System.out.println(str);
	}
	static String rangPrime(int start,int end)
	{ 
		String res="";
		for(int j=start;j<=end;j++)
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
			if(flag && no>1)
			{
				res=res+no+"is prime\n";
			}
				
			
		}
		
		return res;
	}
	

}
