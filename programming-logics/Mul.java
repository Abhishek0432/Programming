package com.Jspiders.Jft;
import java.util.Scanner;
public class Mul {

	public static void main(String[] args) {
	System.out.println("enter the number:");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	int x = number(no);
	System.out.println(x);
	}
	static int number(int no) {
		int mul = 1;
		while(no!=0)
		{
			int rem = no%10;
			mul= mul*rem;
			no = no/10;
		}
		return mul;
		
	}

}
