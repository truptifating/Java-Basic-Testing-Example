package com.test;

public class ReverseStringEx {
	
	public void reverseWordInMyString(String str)
	   {
		
		String[] words = str.split(" ");		
		String reversedString = "";
		
		
		
		for (int i = 0; i < words.length; i++)
	        {
			   System.out.println("Splitted string is " +words[i]);
	           String word = words[i]; 
	           String reverseWord = "";
	           	for (int j = word.length()-1; j >= 0; j--) 
	           {
	           			
			 		
	           		reverseWord = reverseWord + word.charAt(j);
	           }
	      reversedString = reversedString + reverseWord + " ";
	        }
		
		System.out.println(str);
		System.out.println(reversedString);
	   }

	public static void main(String[] args) {
		ReverseStringEx obj1= new ReverseStringEx();
		obj1.reverseWordInMyString("Welcome to Beginners Book");
		obj1.reverseWordInMyString("This is an easy Java Program");

	}

}
