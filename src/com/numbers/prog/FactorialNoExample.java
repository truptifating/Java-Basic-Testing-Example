package com.numbers.prog;

import java.util.Random;

public class FactorialNoExample {

	public static void main(String[] args) {
		 int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);  
		  
		  
		  //Generating a fact no with pseudo random value
		  int lowerLimit=48, upperLimit=57;
			Random r= new Random();
			int a=(int)(r.nextFloat()*(upperLimit-lowerLimit));
			System.out.println("Pseudo random no is--->>"+a);
			
			int facto=1;
			for(int j=1;j<=a;j++)
			{
				facto=facto*j;
			}
			System.out.println("Factorial of pseudo random no--->>>"+facto);

	}

}
