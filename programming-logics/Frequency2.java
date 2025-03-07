package com.Jspiders.Jft;

public class Frequency2 {

	public static void main(String[] args) {
		String str1 = "javaisprogrammiinglanguage";

		int[]arr = new int[127];
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>2) {
				System.out.println((char)i+" "+arr[i]);
			}
		}

	}

}
