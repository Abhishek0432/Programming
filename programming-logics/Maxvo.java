package com.Jspiders.Jft;

public class Maxvo {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		String s1 = str.replaceAll("[aeiouAEIOU ]"," ");
		String [] s2 = s1.split(" ");
		String res = "";
		int max = 0;
		for (int i = 0; i < s2.length; i++) {
			int no = s2[i].length();
			if(no > max) {
				max = no;
				res = s2[i];
			}
		}
		System.out.println(res + " "+ max);
	}

}



