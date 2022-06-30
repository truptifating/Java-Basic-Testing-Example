package com.test;

public class ConvertingStringToInt {

	public static void main(String[] args) {
		String s1="20";
		String s2="30";
		System.out.println("String before converting to int-->>"+s1);
		
	//	2 ways of converting string to int 
		
		//1. parseInt() method
		int i=Integer.parseInt(s1);
		System.out.println("String after converting to int by Parse int methode-->>"+i);
		
//		//2. ValueOf() method
		int j=Integer.valueOf(s2);
		System.out.println("String after converting to int by Value of methode-->>"+j);

	}

}
