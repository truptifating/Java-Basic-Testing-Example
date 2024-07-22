package com.arrays;

import java.util.Arrays;

public class Concatenate_2_Array {

	public static void main(String[] args) {
		 int []a1={1,6,4};
	       int []a2={5,9,2};
	       
	       int length=a1.length + a2.length;
	       
	       int []result= new int[length];
	       int pos=0;
	       
	       for(int element :a1)
	       {
	           result[pos]=element;
	           pos++;
	       }
	       
	       
	       for(int element : a2 )
	       {
	           result[pos]=element;
	           pos++;
	       }
	       System.out.println(Arrays.toString(result));

	}

}
