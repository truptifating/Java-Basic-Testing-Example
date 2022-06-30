package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.xml.crypto.KeySelectorResult;

public class Test 
{
	public static void main(String[] args)
	{
		String str1="Grab";
		String str2="Brag";
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3=str1.toLowerCase();
		String str4=str2.toLowerCase();
		
		System.out.println(str3);
		System.out.println(str4);
		
		if(str1.length()!=str2.length())
		{
			System.out.println("String is not anagram");
		}
		else 
		{
			char ch1[]=str3.toCharArray();
			char ch2[]=str4.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)==true) 
			{System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
		}
		
		
		
	}
}
	
