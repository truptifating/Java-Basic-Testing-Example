package com.arrays;

public class ObjectArrayEx {

	public static void main(String[] args) {
		int num=123;
		String name="Trupti";
		
		Object []a= {num,name}; //Object array is used to store elements of different datatype
		//this object array comes under java.lang.objectclass
		for(Object k:a)
		{
			System.out.println(k);
		}

	}

}

