package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) 
	{
		HashSet<String> h= new HashSet<String>();
		h.add("America");
		h.add("India");
		h.add("France");
		h.add("Europe");
		h.add("Australia");
		h.add("India");
		System.out.println("Printing all the added countries-->" +h); //HashSet is based on array.
		//Item index in array is calculated based on hashCode() function.
		//Iterator in HashSet moves over array elements, skipping null elements. 
		//That's why order after printing is 'strange'. If we need to preserve insertion order, use LinkedHashSet

		
		System.out.println("The size of set is-->"+h.size());

		h.contains("Europe");
		
		h.remove("Europe");
		System.out.println("After removing Europe-->"+h);
		
		// Iterating over HashSet
		System.out.println("Iterating over hasSet");
		Iterator<String> itr= h.iterator();
		while(itr.hasNext())
		{
			System.out.println("Printing after iteration->"+itr.next());
		}		
		
//		h.clear();
//		System.out.println("After clearing set-->"+h);
		

	}

}
