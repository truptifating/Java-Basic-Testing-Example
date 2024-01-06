package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToList {

	public static void main(String[] args) {
		
		//Converting Array to Array List
		String citynames[]= {"Pune","Mumbai","Nagpur"}; // Declairing Array
		System.out.println("Print the array before conversion"+Arrays.toString(citynames));
		
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames)); // Converting array to array list
		System.out.println("Print the array after conversion"+citylist);
		
		citylist.add("Delhi");
	
		
		for(String str:citylist) 
		{
			System.out.println(str);
		}
		
		// Converting Array List to Array
		ArrayList<String> newList= new ArrayList<String>(Arrays.asList("Trupti","Ram","Vishnu","Trupti","Motghare","Fating"));
		System.out.println("Array List before converting to Array-->>"+newList);
		Object arr[]= newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		//Iterating array
				for(Object o:arr)
				{
					//System.out.println((String)o);
					System.out.println(o);
				}
		
		
		
		
		
		
						
		
//		//Creating Array
//		String array[]= {"Trupti", "Fating", "Motghare"};
//		
//		//Print the array before conversion
//		System.out.println("Print the array before conversion"+Arrays.toString(array));
//		
//		//calling the function for Converting array to list
//		List<String> list=ArrayToListConversion(array);		
//		
//		System.out.println("New array list"+list);
//
//	}
//    
//	// Function of converting to Array to list
//	public static <T> List<T> ArrayToListConversion(T array[])
//	{
//		List<T> list= new ArrayList<>();
//		
//		for(T t:array)
//		{
//			list.add(t);
//		}
//		return list;
	}
}
