package com.numbers.prog;

import java.util.Random;

public class GeneratingRandomNo {
	

	public static void main(String[] args) {
		 //ASCII value of a-z is 97 to 122 && ASCII value of A-Z is 65-90
		//ASCII value of 0-9 is 48-57
		
		int lowerLimit=48,upperLimit=57;
		int targetLimit=2;
		int b=0;
		
		Random r= new Random();
		
		for(int i=0;i<=targetLimit;i++)
		{
			int a=(int)(r.nextFloat()*(upperLimit-lowerLimit));
			//System.out.println(a);
			b=b+a;
		}
		System.out.println(b);
		
		
	       
	        
	}

}

//note 
//RAND()	Generate random decimal numbers between 0 and 1.
//RAND()*N	Generate random decimal numbers between 0 and N.
//RAND()*(B-A)+A	Generate random decimal numbers between any two numbers you specified. (A is the lower bound value and B is the upper bound value.)
