package com.Jspiders.Jft;

public class Summsq {

	public static void main(String[] args) {
		int no =40003555;
		while(no>9) {
			no = numSum(no);
		}
		System.out.println(no);
	}
	static int numSum(int no) {
		int sum = 0;
		while(no!=0) {
			int rem = no%10;
			sum+=Math.pow(rem,2);
			no = no/10;
		}
		return sum;
	}

}


