package com.numbers.prog;

import java.util.Random;

public class GeneratingRandomNo {
	

	public static void main(String[] args) {
		 //ASCII value of a-z is 97 to 122 && ASCII value of A-Z is 65-90
		//ASCII value of 0-9 is 48-57
		/*int lowerLimit=48,upperLImit=57;
        Random r= new Random();
        int a=(int)(r.nextFloat()*(upperLImit-lowerLimit));
        System.out.println("FinalValue--"+a);
	*/
		Random r= new Random();
		int a=r.nextInt(10);
		System.out.println(a);
		
	}

}

//note 
//RAND()	Generate random decimal numbers between 0 and 1.
//RAND()*N	Generate random decimal numbers between 0 and N.
//RAND()*(B-A)+A	Generate random decimal numbers between any two numbers you specified. (A is the lower bound value and B is the upper bound value.)
