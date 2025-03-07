package com.Jspiders.Jft;

public class MAX {

	public static void main(String[] args) {
		String str = "43785";
		int max=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int no = (ch - 48);
					if(no > max)
					{
						max=no;
					}
		}
		System.out.println(max);

	}

}
