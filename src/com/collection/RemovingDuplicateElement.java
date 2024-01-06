package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateElement {

	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,4,5,5,7,8,2,1));
		
		//1.Linked Hash Set
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicate= new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDuplicate);
		
		//2.JDK 8-Stream
		ArrayList<Integer> marksList= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,4,5,5,7,8,2,1));
		List<Integer> marksListUnique=marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
	}

}
