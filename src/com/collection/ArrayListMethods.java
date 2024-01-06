package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("Javascript");
		System.out.println(ar1);
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("Devops");
		
	//	ar1.addAll(ar2);
	//	System.out.println("After adding ar1 and ar2--->>"+ar1);
		
		ar1.addAll(2, ar2);
		System.out.println(ar1);
	//	ar1.clear();
	//	System.out.println(ar1);
		
		ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
		System.out.println("List after clonning"+cloneList);
		
		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.contains("C"));		
		System.out.println(ar1.indexOf("Ruby")>0);
		
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList("Trupti","Ram","Vishnu","Trupti"));
		System.out.println("Data from List 1-->>"+list1);
		
		int i=list1.lastIndexOf("Trupti");
		System.out.println(i);
		list1.remove(0);
		System.out.println(list1);
		
		list1.remove("Trupti");
		System.out.println(list1);
		
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num-> num%2==0);
		System.out.println(numbers);
		
		ArrayList<Integer> numbers1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));		
		ArrayList<Integer> sublist=new ArrayList<Integer>(numbers1.subList(2, 6));
		System.out.println(sublist);
		
		ArrayList<String> namesList= new ArrayList<String>(Arrays.asList("Trupti","Ram","Vishnu","Trupti","Motghare"));
		System.out.println(namesList);
		
		namesList.removeAll(Collections.singleton("Trupti"));
		System.out.println(namesList);
		
		//Converting arrayList to Array
		
		ArrayList<String> newList= new ArrayList<String>(Arrays.asList("Trupti","Ram","Vishnu","Trupti","Motghare","Fating"));
		Object arr[]=newList.toArray();
		System.out.println(Arrays.toString(arr));
		
		//Iterating array
		for(Object o:arr)
		{
			//System.out.println((String)o);
			System.out.println(o);
		}
		
		
		
	}

}
