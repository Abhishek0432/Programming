package com.Jspiders.Jft;

public class Fsthalfrev {

	public static void main(String[] args) {
		int n = 123456;
		String no = Integer.toString(n);
		int len = no.length()/2;
		int f = Integer.parseInt(no.substring(0,len));
		String l=no.substring(len);
		String rev=revNo(f);
		System.out.println(Integer.parseInt(rev+l));

	}
	static String revNo(int no) {
		int res = 0;
		while (no!=0) {
			int rem = no%10;
			res = (res*10)+rem;
			no=no/10;
		}
		return Integer.toString(res);
		}
}


