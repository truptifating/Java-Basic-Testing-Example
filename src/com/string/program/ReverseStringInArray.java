package com.string.program;

public class ReverseStringInArray {

	public static void main(String[] args) {
	
		
		String []t={"Ram","Vishnu","Trupti"};
		int length=t.length;
		String rverseString="";
		for(int i=0;i<length;i++)
		{
			String word=t[i];
			String rverse="";
			for(int j=word.length()-1;j>=0;j--)
			{
				rverse=rverse+word.charAt(j);
				
			}
			rverseString=rverseString+rverse;
		}
		System.out.println(rverseString);
	}

}
