package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iteration {

	public static void main(String[] args) {
		ArrayList<String> studentList= new ArrayList<String>();
		studentList.add("Calfie");
		studentList.add("Tommy");
		studentList.add("Ruby");
		studentList.add("Jackey");
		System.out.println(studentList);
		
		//typical for loop
		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
		
		System.out.println("-------");
		
		
		// for each loop
		for(String s:studentList)
		{
			System.out.println(s);
		}
		System.out.println("-------");
		
		//JDK 8- Streams with Lambda
		studentList.stream().forEach(ele->System.out.println(ele));
		System.out.println("-------");
		
		
		//Iterator
		Iterator<String> it=studentList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
