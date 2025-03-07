package com.Jspiders.Jft;

public class Sample {

	public static void main(String[] args) {
		String s1 = "AbKmzaZ";
		String res = " ";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='z')
			{
				res = res + 'A';
			}
			else if(s1.charAt(i)=='Z')
			{
				res = res + 'a';
			}
			else
			{
				res = res + (char)(s1.charAt(i)+1);
			}
		}
		System.out.println(res);
		
	}

}
