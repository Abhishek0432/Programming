package com.Jspiders.Jft;

public class Summ3 {

	public static void main(String[] args) {
		int no =79;
		while(no>9) {
			no = numSum(no);
		}
		System.out.println(no);
	}
	static int numSum(int no) {
		int sum = 0;
		while(no!=0) {
			int rem = no%10;
			sum+=rem;
			no = no/10;
		}
		return sum;
	}

}
