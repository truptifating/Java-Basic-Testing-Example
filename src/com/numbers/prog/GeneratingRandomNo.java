package com.numbers.prog;

import java.util.Random;

public class GeneratingRandomNo {

	public static void main(String[] args) {
		 //ASCII value of a-z is 97 to 122 && ASCII value of A-Z is 65-90
		int targetstringLengh=10;
		int leftLimit=97;
		int rightLimit=122;
		
		Random r = new Random();
		StringBuilder buffer= new StringBuilder(targetstringLengh);
		  
	        // check next float value and printing it 
	        System.out.println("Next float value is = "
	                           + r.nextFloat()); 
	       
	        
	        for(int i=0;i<targetstringLengh;i++)
	        {
	        //RAND()*(B-A)+A	Generate random decimal numbers between any two numbers you specified. 
	        //(A is the lower bound value and B is the upper bound value.)
	        //	int a= leftLimit+(int)(r.nextFloat()*(rightLimit-leftLimit)+leftLimit);-OUTPUT--->>ÂÐÊÆÊÆÅÇÃÅ
	        	int a= leftLimit+(int)(r.nextFloat()*(rightLimit-leftLimit+1)); 	
		        System.out.println(a);
		        System.out.println(buffer.append((char)a));
	        }
	        
	        String generatedString = buffer.toString();
	        System.out.println("Generated String-->>"+buffer.toString());
	        String finalString="DB_UAT_CYCLE1_" + generatedString;
	        System.out.println("finalString--->>"+finalString);
	        
	}

}

//note 
//RAND()	Generate random decimal numbers between 0 and 1.
//RAND()*N	Generate random decimal numbers between 0 and N.
//RAND()*(B-A)+A	Generate random decimal numbers between any two numbers you specified. (A is the lower bound value and B is the upper bound value.)
