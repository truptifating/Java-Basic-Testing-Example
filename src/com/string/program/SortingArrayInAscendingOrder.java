package com.string.program;

import java.util.Arrays;

public class SortingArrayInAscendingOrder {

	public static void main(String[] args) {
		int []a= {1,2,5,3,7,0};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		char []c= {'z','a'};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}

}
