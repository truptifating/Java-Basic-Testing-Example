package com.numbers.prog;

public class PyramidStarPattern {

	public static void main(String[] args) 
	{
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 6;       		 
		for (i=0; i<row; i++)   //Outer loop work for rows 
		{  		      
    		for (j=row-i; j>1; j--)  //inner loop work for space 
    		{  		 
    			System.out.print(" ");   //prints space between two stars 
    		}  
		 
    		for (j=0; j<=i; j++ ) //inner loop for columns   
    			{   
		    
    				System.out.print("* ");   //prints star  
    			}   
		  		System.out.println();   //throws the cursor in a new line after printing each line
		}   

	}

}
