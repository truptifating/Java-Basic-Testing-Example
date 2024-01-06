package com.numbers.prog;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) 
	{
		
      int vCount=0, cCount=0;      
      String str="I am a good mother";      
      str=str.toLowerCase();      
      System.out.println(str);
     
      for(int i=0;i<str.length();i++)
      {
    	  if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u')
          {
        	  vCount++;
          }
    	  else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
    	  {
    		  cCount++;
    	  }
      }
      
      System.out.println("No os vowels"+vCount);
      System.out.println("No os vowels"+cCount);
      
      
      
      
      
	}

}
