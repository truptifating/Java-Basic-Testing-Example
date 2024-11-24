package com.arrays;

public class Finding_DuplicateNo_InArray 
{

	public static void main(String[] args) 
	{
		int []num={5,2,5,6,9,2,6,0,1,4};
		int length=num.length;
		int i,j;
		
		System.out.println("Duplicate elements are:");
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				if(num[i]==num[j])
				{
					
					System.out.println("Duplicate no -->>"+num[j]);
				}
			}
			
		}
		
	}

}
