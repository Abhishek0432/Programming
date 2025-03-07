package com.Jspiders.Jft;



public class Practicequestions2 {

	public static void main(String[] args) {
		//2.string comparison and matching
		
		//1.check if the two strings are equal
//		String s1 = "amma";
//		String s2 = "appa";
//		if(s1.equals(s2))
//		{
//			System.out.println("yess");
//		}
//		else {
//			System.out.println("nooo");
//		}
		
		//2.check if the two strings are equal ignoring case
//		String s1 = "AMMa";
//		String s2 = "anna";
//		if(s1.equals(s2))
//		{
//			System.out.println("yess");
//		}
//		else {
//			System.out.println("nooo");
//		}
//		
		//3.check if a string contains a substring
//		String s1 = "hi how are youu";
//		if(s1.contains("how")) {
//			System.out.println("yess");	
//			}
//			else {
//				System.out.println("nooo");
//			}
//		}
//	
		//4.check if a string starts with a specific substring
//		String s1 = "java is programming";
//		String s2 = "java";
//		if(s1.startsWith(s2))
//		{
//			System.out.println("yess");	
//		}
//		else {
//			System.out.println("nooo");	
//		}
		
		//5.check if a string ends with a specific substring
	//	String s1 = "java is programming lang";
	//	String s2 = "lang";
	//	if(s1.endsWith(s2))
	//	{
	//		System.out.println("yess");	
	//	}
	//	else {
	//		System.out.println("nooo");	
	//	}
		
		//6.find the first occurence of a character 
//		String s1 = "java is programming language";
//		char ch = 'g';
//		for(int i=0;i<s1.length();i++)
//		{
//			if(ch==s1.charAt(i)) {
//				System.out.println(i);
//				break;
//			}
//		}
//		
			
		
		//7.find the last occurence of a character 
//		String s1 = "java is programming language";
//		char ch = 'a';
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			if(ch==s1.charAt(i)) {
//				System.out.println(i);
//				break;
//			}
//		}
//		
//		
		
	//	8.find all occurences of a character.
//		String str = "java programming language";
//		char ch = 'g';
//		for(int i=0;i<str.length();i++)
//		{
//			if(ch==str.charAt(i))
//			{
//				System.out.println(i);
//			}
//			
//		}
		
		//9.find the first occurence a substring
//		String str = "java is programming language";
//		String s1 = "java";
//		System.out.println(str.indexOf(s1));
//		
		//10.find the last occurence a substring
		
//		
//		String str = "java is programming language";
//		String s1 = "language";
//		System.out.println(str.lastIndexOf(s1));
//		
		
		
		
		//11.check if a string contains only digits.
//		String str = "java is programming language";
//		if(str.contains(str.replaceAll("^[0-9]", " ")))
//		{
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("nooo");
//		}
		
		//12.check if a string contains only letters.
//		String str = "java is programming12333 language";
//		if(str.contains(str.replaceAll("^[a-z,A-Z]", " ")))
//			{
//				System.out.println("yes");
//			}
//			else {
//				System.out.println("nooo");
//			}
		
		
		//13.COMPARE two strings based on their length
//		String s1 = "amma";
//		String s2 = "appa";
//		int s3 = s1.length();
//		int s4 = s2.length();
//		if(s3==s4)
//		{
//		System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
		
		//14.check if a string contains only alphanumeric characters.
//		String s1 = "abcd123";
//		if(s1.contains(s1.replaceAll("[^a-z,A-Z,0-9]","")))
//		{
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//		
		
		//15.find the index of first vowel in a string
		
//		String s1 = "java programming";
//		for(int i=0;i<s1.length();i++) {
//			char ch = s1.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				System.out.println("the fst vowel" +i);
//				break;
//			}
//		}
//		
		
		
		
		
		
		
		//16.find the index of last vowel in a string

	
		
		//17.count the number of vowels in a string
		
//		String s1 = "programming in java";
//		String s2 = s1.replaceAll("[^aeiouAEIOU]","");
//		System.out.println(s2.length());
//		
		//18.count the number of consonents in  a string
//		String s1 = "programminginjava";
//		String s2 = s1.replaceAll("[aeiouAEIOU]","");
//		System.out.println(s2.length());
//		
	}
}
