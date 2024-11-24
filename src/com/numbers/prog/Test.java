package com.numbers.prog;

import java.util.Arrays;
import java.util.Random;

public class Test {
	

	public static void main(String[] args) 
	{
		 int row=6,i,j;
		 
		 for(i=0;i<row;i++)
		 {
			 for(j=2*(row-i);j>1;j--)
			 {
				 System.out.print(" ");
			 }
			 for(j=0;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
///classname.main(new String[0])
