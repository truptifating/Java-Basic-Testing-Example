package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromConsole {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the length of array");
		n=sc.nextInt();
		int []arr= new int[n];
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	}

}
