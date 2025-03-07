package com.Jspiders.Jft;

public class Midsum {

	public static void main(String[] args) {
		int n = 123456;
		String no = Integer.toString(n);
		
		String a = no.substring(0,1);
		String b = no.substring(no.length()-1);
		int len = Integer.parseInt(no.substring(1,no.length()-1));
		int rev=sumMid(len);
		System.out.println(a+rev+b);

	}
	static int sumMid(int no) {
		int sum = 0;
		while (no!=0) {
			int rem = no%10;
			sum = sum+rem;
			no=no/10;
		}
		return (sum);
		}
}
