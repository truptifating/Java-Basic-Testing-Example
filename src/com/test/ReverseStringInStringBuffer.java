package com.test;

public class ReverseStringInStringBuffer {

	public static void main(String[] args) 
	{

		StringBuffer obj= new StringBuffer("Trupti");
		obj.append(" Fating");
		System.out.println(obj);
		
		obj.reverse();
		System.out.println(obj);

	}

}
