package com.Jspiders.Jft;

public class Reverseenum {

	public static void main(String[] args) {
		int no = 123456;
		int no1 = no%1000;
		int no2 = no-no1;
		no1 = reverse(no1);
		System.out.println(no2+no1);
	}
	
	static int reverse(int no1) {
		int result=0;
		while(no1!=0) {
			int rem = no1%10;
			result = (result*10)+rem;
			no1 = no1/10;
			
		}
		return result;
	}
	
}
