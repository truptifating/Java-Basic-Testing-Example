package com.arrays;

import java.util.Arrays;

public class CopyArray 
{

	public static void main(String[] args) 
	{
		int []source= {1,5,4,8,9,3,2};
		int []destination=new int[7];
		
		//Iterate and copy element
		for(int i=0;i<source.length;i++)
		{
		    destination[i] = source[i];
		}
		System.out.println(Arrays.toString(destination));
		       

	}

}
