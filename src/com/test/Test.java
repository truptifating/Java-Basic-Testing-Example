package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.xml.crypto.KeySelectorResult;

public class Test 
{
	public static void main(String[] args)
	{
		int targetLength=10;
		int rightLimit=97;
		int leftLimit=122;
		
		Random r= new Random();
		StringBuilder buffer=new StringBuilder(targetLength);
		System.out.println(r.nextFloat());
		
		for(int i=0;i<targetLength;i++)
		{
			int a=rightLimit+(int)(r.nextFloat()*(leftLimit-rightLimit+1));
			System.out.println(a);
			System.out.println(buffer.append((char)a));
		}
		
		String generatedString=buffer.toString();
		System.out.println("generatedString-->>"+generatedString);
		String finalString="DB__"+generatedString;
		System.out.println(finalString);
		
		
		
	}
}
	
