package com.Jspiders.Jft;

public class Maxsen {

	public static void main(String[] args) {
		String str = "java is programming language";
		int max=0;
		String res = "";
		String []s1=str.split(" ");
		for(int i=0;i<s1.length;i++) {
			int no = s1[i].length();
			if(no > max) {
				max = no;
				res = s1[i];
			}
		}
		System.out.println(max + " " +res);
	}

}
