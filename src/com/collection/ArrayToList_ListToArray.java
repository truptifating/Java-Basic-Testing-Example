package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList_ListToArray {

	public static void main(String[] args) 
	{
		// Declairing Array
		String citynames[]= {"Pune","Mumbai","Nagpur"}; 
		
		//Printing Array
		System.out.println("Print the array before conversion-->>"+Arrays.toString(citynames));
		
		// Converting array to array list
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames)); 
		System.out.println("Array List--->>"+citylist);
		
	    //Converting array list to array
		Object arr[]=citylist.toArray(); 
		
		//Printing Array
		System.out.println("Printing the array-->>"+Arrays.toString(arr));

	}

}
