package com.arrays;

public class PrintingArray {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		
		//1 way
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		//2 way
		for(int num : a) 
		{
			System.out.println(num);
		}
	}

}
