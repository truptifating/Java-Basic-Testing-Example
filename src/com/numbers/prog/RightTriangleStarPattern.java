package com.numbers.prog;

public class RightTriangleStarPattern 
{

	public static void main(String[] args) 
	{
		
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row=6;   		 
		for(i=0; i<row; i++)   //outer loop for rows 
		{   		
		for(j=0; j<=i; j++)   //inner loop for columns  
		{   
		 
		System.out.print("* ");   //prints stars  
		
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		
		

	}

}
