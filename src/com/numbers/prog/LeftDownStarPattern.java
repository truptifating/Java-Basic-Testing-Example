package com.numbers.prog;

public class LeftDownStarPattern {

	public static void main(String[] args) {
        int row=6,i,j;
		
		for(i=0;i<=row;i++)
		{
			for(j=row-i;j>=0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
