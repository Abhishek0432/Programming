package com.Jspiders.Jft;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi bro hi";
		String[] str1 = str.split(" ");
		for(int i=0;i<=str1.length;i++) {
			boolean flag=true;
			for (int j = 0; j < str1.length; j++) {
				if(i!=j && str1[i].equals(str1)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(str1[i]);
			}
		}

	}

}
