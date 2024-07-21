package com.arrays;

public class FindingEven_Odd_No_InArray {

	public static void main(String[] args) 
	{
		int []num= {1,3,4,2,6,8,7,9,0};
		int i;
		
		System.out.println("Even no are-->>");
		for(i=0;i<num.length;i++)
		{
		  if((num[i]%2)==0)
		  {
		      System.out.println(num[i]);
		  }
		}
		
		System.out.println("Odd no are-->>");
		for(i=0;i<num.length;i++)
		{
		    if((num[i]%2)!=0)
		    {
		        System.out.println(num[i]);
		    }
		}
		
	}
}
