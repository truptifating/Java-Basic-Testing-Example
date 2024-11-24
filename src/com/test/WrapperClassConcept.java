package com.test;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="100";
		
		//Data conversion from string to int
		int i=Integer.parseInt(x);
		System.out.println(i);
		
		//Data conversion from string to double
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(y);
		
		//Data conversion from string to boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Integer to String conversion
		int j=20;
		String s=String.valueOf(j);
		System.out.println(j);
			
		
		

	}

}
