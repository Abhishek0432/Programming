package com.Jspiders.Jft;

public class Fstsecboth {
	public static void main(String[] args) {
		int n = 123456;
		String no = Integer.toString(n);
		int len = no.length()/2;
		int f = Integer.parseInt(no.substring(0,len));
		int l=Integer.parseInt(no.substring(len));
		String rev=revNo(f);
		String rev2=revNo(l);
		System.out.println(Integer.parseInt(rev+rev2));

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
