package com.numbers.prog;

import java.util.Arrays;
import java.util.Random;

public class Test {
	

	public static void main(String[] args) 
	{
		int []a1={1,2,3};
	      int []a2={4,5,6};
	      int length= a1.length + a2.length;
	       System.out.println("length is-->>"+length);
	      int []result = new int[length];
	      int pos=0;
	      
	      for(int element:a1)
	      {
	         result[pos]=element;
	         pos++;
	      }
	      
	      for(int element:a2)
	      {
	         result[pos]=element;
	         pos++;
	      }
	      System.out.println(Arrays.toString(result));
	}

}
///classname.main(new String[0])
