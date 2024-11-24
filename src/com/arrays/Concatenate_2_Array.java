package com.arrays;

import java.util.Arrays;

public class Concatenate_2_Array {

	public static void main(String[] args) {
		int []a={3,1,5,6,7,8,0};
	       int []a2={10,20};
	       int length=a.length+a2.length;
	       int []a3=new int [length];
	       int pos=0;
	       
	       for(int i=0;i<a.length;i++)
	       {
	           a3[pos]=a[i];
	           pos++;
	       }
	       for(int j=0;j<a2.length;j++)
	       {
	           a3[pos]=a2[j];
	           pos++;
	       }
	       System.out.println(Arrays.toString(a3));
	       

	}

}
