package com.Jspiders.Jft;

public class Sample3 {

//	public static void main(String[] args) {
//		int year = 2000;
//		if(year%4==0 && year%400==0)
//		{
//			System.out.println("leap yr");
//		}
//		else {
//			System.out.println("not leap yr");
//		}
//	}
	
	/*
	    public static int findFirstVowel(String str) {
	        // Define vowels (both uppercase and lowercase)
	        String vowels = "aeiouAEIOU";
	        
	        // Iterate through the string
	        for (int i = 0; i < str.length(); i++) {
	            if (vowels.indexOf(str.charAt(i)) != -1) {
	                return i; // Return the index of the first vowel
	            }
	        }
	        
	        return -1; // Return -1 if no vowel is found
	    }

	    public static void main(String[] args) {
	        String input = "programming";
	        int index = findFirstVowel(input);
	        if (index != -1) {
	            System.out.println("The first vowel is at index: " + index);
	        } else {
	            System.out.println("No vowels found in the string.");
	        }
	    }
	
	*/
	

 /*	    public static int findLastVowel(String str) {
	        // Define vowels (both uppercase and lowercase)
	        String vowels = "aeiouAEIOU";
	        
	        // Iterate through the string from the end
	        for (int i = str.length() - 1; i >= 0; i--) {
	            if (vowels.indexOf(str.charAt(i)) != -1) {
	                return i; // Return the index of the last vowel
	            }
	        }
	        
	        return -1; // Return -1 if no vowel is found
	    }

	    public static void main(String[] args) {
	        String input = "programming";
	        int index = findLastVowel(input);
	        if (index != -1) {
	            System.out.println("The last vowel is at index: " + index);
	        } else {
	            System.out.println("No vowels found in the string.");
	        }
	    }
	*/


	    public static boolean isAlphanumeric(String str) {
	        // Check if the string matches the alphanumeric pattern
	        return str.matches("[a-zA-Z0-9]+");
	    }

	    public static void main(String[] args) {
	        String input = "Hello123";
	        if (isAlphanumeric(input)) {
	            System.out.println("The string contains only alphanumeric characters.");
	        } else {
	            System.out.println("The string contains non-alphanumeric characters.");
	        }
	    }
	


}
