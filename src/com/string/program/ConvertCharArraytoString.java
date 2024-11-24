package com.string.program;

public class ConvertCharArraytoString {

	public static void main(String[] args) {
		 //Converting char to String
		char a='b';
		String st1=String.valueOf(a);
		System.out.println(st1);
		String st2=Character.toString(a);
		System.out.println(st2);
		
		//Converting Char Array to String
		char []ch={'a','b','c'};
		String st3= new String(ch);
		System.out.println(st3);
	}

}
