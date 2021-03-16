package com.test;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) 
	{
		String str1="Brag";  
        String str2="Grab";  
  
        //Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
        
        System.out.println("Value str 1-" +str1);
        System.out.println("Value str 2-" +str2);
  
        //Checking for the length of strings  
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
            
            System.out.println("Value string 1-" +string1);
            System.out.println("Value string 2-" +string2);
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
            
            
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  

	}

}
