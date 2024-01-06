package com.numbers.prog;

public class ArmstrongNoProgramm 
{

	public static void main(String[] args) 
	{
		 	int c=0,a,temp;  
		    int n=153;//It is the number to check armstrong  
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;   //it will take remainder
		    n=n/10;  //it will take quotient
		    
		    c=c+(a*a*a);  		    
		    }  
		   // System.out.println("c"+c);
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");  

	}

}
