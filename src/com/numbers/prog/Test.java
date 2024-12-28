package com.numbers.prog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Test {
	

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1,"trupti");
		hm.put(2, "Ram");
		hm.put(3,"Vishnu");
		System.out.println(hm);
		
		for(Integer i:hm.keySet())
		{
			System.out.println(i);
		}
		for(String s:hm.values())
		{
			System.out.println(s);
		}
	}

}
