package com.test;

public class StringExample1 {

	public static void main(String[] args) 
	{
		String s2="abc";
		
		//String Copy	
		String s3= new String(s2);
		
		//Creating string with direct string literal
		String s4= new String("bbc");
		
		//String Assignment
		String s5=s4;
		
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println(s2==s3);    // == sign verifies the address of variables
		System.out.println("s2.equals(s3)-->"+s2.equals(s3));  // .equals sign verifies the contents of variables
		System.out.println(s4==s5);
		System.out.println("s4.equals(s5)--->"+s4.equals(s5));
		
		String s6="a";
		String s7="a";
		System.out.println(s6==s7);
		System.out.println("s6.equals(s7)--->"+s6.equals(s7));
		
		String s8= new String("a");
		String s9= new String("a");
		System.out.println(s8==s9);
		System.out.println("s8.equals(s9)--->"+s8.equals(s9));
		

	}

}
