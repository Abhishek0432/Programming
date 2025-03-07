package com.Jspiders.Jft;
import java.util.Scanner;
public class Sumeven {
	public static void main(String[] args) {
		System.out.println("enter the number");
		try (Scanner sc = new Scanner(System.in)) {
			int no = sc.nextInt();
			int x = number(no);
			System.out.println(x);
		}
	}
	static int number(int no) {
		int sum = 0;
		while(no!=0)
		{
			int rem = no%10;
			if(rem%2==0)
			{
			sum= sum+rem;
			}
			no = no/10;
		}
		return sum;
		
	}

}
