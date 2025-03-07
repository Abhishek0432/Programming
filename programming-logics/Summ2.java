package com.Jspiders.Jft;
import java.util.Scanner;

public class Summ2 {

	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int x = number(no);
		System.out.println(x);
	}
	public static int number(int no)
	{
		int sum = 0;
		while(no !=0)
		{
			int rem = no % 10;
			sum = sum+rem;
			
			no = no/10;
		}
		return sum;
		
	}

}
