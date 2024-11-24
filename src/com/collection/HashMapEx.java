package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {

	public static void main(String[] args) 
	{
		HashMap<String, String> hm= new HashMap<String, String>();
		hm.put("Maharashtra", "Mumbai");
		hm.put("Telangana", "Hyderabad");
		hm.put("UP", "Lukhnow");
		hm.put("Rajasthan", "Jaipur");		

		System.out.println("City and its capital-->"+hm);
		
		System.out.println("Size of Map-->"+hm.size());
		
		
		
		// Loop through hash map and printing keys only
		for(String i:hm.keySet() ) 
		{
			System.out.println("Printing keys only-->"+i);
		}
		
		// Loop through hash map and printing Values only
		for(String j:hm.values() ) 
		{
			System.out.println("Printing Values only-->"+j);
		}
		// Loop through hash map and printing keys and values
		for(String i:hm.keySet())
		{
			System.out.println("Printing Key and Values-->"+"Key:"+i+"  "+"Value:"+hm.get(i));
		}		
		
		hm.remove("Rajasthan");
		System.out.println("City and its capital after removing rajasthan-->"+hm);
		
		/*hm.clear();
		System.out.println("Clearing all the City's and its capital-->"+hm);*/
		
		//Validating the keys in Maps
		if(hm.containsKey("UP"))
		{
			System.out.println("Entry Key is verified");
		}
		//Validating the keys in Maps

		if(hm.containsValue("Lukhnow"))
		{
			System.out.println("Entry Value is verified");
		}
		//Validating the keys and value in Maps
		if(hm.containsKey("Maharashtra"))
		{
			System.out.println("Printing value of key-->>"+hm.get("Maharashtra"));
		}
	}

}
