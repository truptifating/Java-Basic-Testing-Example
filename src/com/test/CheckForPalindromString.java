package com.test;

public class CheckForPalindromString 
{
   
	
	public static void main(String[] args) 
	{
		String str="12321", reverse="";
	      
	      
	      
	      for(int i=str.length()-1;i>=0;i--)
	      {
	    	  
	    	  reverse=reverse+str.charAt(i); 
	      }
	      
	     System.out.println("Reverse string is:"+reverse);
	     
	     if(str.equals(reverse))
	     {
	    	 System.out.println("String is palindrome");
	     }
	     else {
	    	 System.out.println("String is not palindrome");
	     }
	      

	}
}
