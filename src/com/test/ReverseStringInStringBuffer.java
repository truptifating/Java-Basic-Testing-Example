package com.test;

public class ReverseStringInStringBuffer {

	public static void main(String[] args) 
	{
        //String Buffer programme
		StringBuffer obj= new StringBuffer("Trupti");
		obj.append("Fating");
		System.out.println("Output of String buffer-->>"+obj);  // As stringbuffer is muttable and hence we will able to concat it
		
		obj.reverse();
		System.out.println(obj);
		
		
		//STring Program
		String str= new String("Trupti");
		str.concat("Fating");
		System.out.println("Output of String-->>"+str); // As string is immutable and hence it will print Trupti only
		System.out.println("String after concatination"+str.concat("Fating"));
	    //System.out.println(str.reverse());  As it is string we will not able to apply reverse function directly to it
		
		// String Builder programe
		StringBuilder obj2= new StringBuilder("Trupti");
		obj2.append("Fating");
		System.out.println("Output of String Builder-->>"+obj2);
		
		
		//Note--> 1) Performance wise string builder takes less time to execute than string buffer
		//        2) Performance wise string builder and string buffer takes less time to execute than string
		

	}

}
