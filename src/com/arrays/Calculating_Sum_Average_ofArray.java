package com.arrays;

public class Calculating_Sum_Average_ofArray 
{
	public static void main(String[] args)
	{
		 int []a={3,2,5,6,9,2};
	       int i,sum=0;
	       
	       for(i=0;i<a.length;i++)
	       {
	           sum=sum + a[i];           
	       }
	       System.out.println("Sum of Array-->>"+sum);
	       
	       int size=a.length;
	       System.out.println("Size of array-->>"+size);
	       
	       //Calculating Average
	       float average;
	       average=((float)sum/(float)size);
	       System.out.println("Average-->>"+average);
	       
	       //Calculating Percentage
	       float percentage;
	       percentage=((float)sum/(float)size)*100;
	       System.out.println("Percentage-->>"+percentage);
		       
	}

}
