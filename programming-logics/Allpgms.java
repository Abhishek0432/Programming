package com.Jspiders.Jft;

public class Allpgms {
	public static void main(String[] args) {
		String s = isPrime(7);
		System.out.println(s);
		
	}
     static String isPrime(int n)
	{
		boolean flag=true;
		if(n < 2)
		{
			return "not a prime";
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			return (n +" prime");
		}
		else {
			return (n + "not a prime");
		}
		
		
	}
}
