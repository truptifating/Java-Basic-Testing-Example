package com.arrays;

import java.util.Arrays;

public class Finding_Missing_ElementInArray {

	public static void main(String[] args)
	{
		int []numbers={1,2,3,4,6,7,8,9};
        int n=(numbers.length)+1;
        System.out.println(n);
        int sum1=(n*(n+1))/2; //function helps to find the sum of elements from 1 to n
        System.out.println(sum1);
        
        int sum2=0;
        for(int i=0;i<numbers.length;i++)       
        {
            sum2=sum2+numbers[i]; // here we are finding the sum from given list of array
        }
        System.out.println(sum2);
        int no=sum1-sum2;
        System.out.println("Missin no-->>"+no);
        

	}

}
