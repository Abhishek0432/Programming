package com.Jspiders.Jft;



public class Sample2 {

	public static void main(String[] args) {
		String s1 = "hi how are you";
		String [] s2 = s1.split(" ");
		
		for(int i=0;i<s1.length();i++)
		{
			reverseString(s2[i]+" ");
		}
	}
	
	public static void reverseString(String str)
	{
		String res = "";
		for (int  i = str.length()-1;i >= 0; i--)
		{
			res = res+str.charAt(i);
		}
		System.out.println(res+" ");
	}
	

}
