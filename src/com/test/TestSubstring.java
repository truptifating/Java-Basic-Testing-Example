package com.test;

public class TestSubstring {

	public static void main(String[] args) 
	{
		
		String name="SachinTendulkar";
		System.out.println(name);		
		System.out.println(name.substring(0)); //String starts with 0 and goes to end
		System.out.println(name.substring(4)); //String starts with 4 location
		System.out.println(name.substring(1, 5)); //String starts with 1 and goes to 5
		System.out.println(name.substring(1, 20)); //Return exception (String index out of range: 20)
		
		
		
	}
		

}
