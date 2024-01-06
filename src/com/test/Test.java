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
		int num=7, flag=0;
		int n=num/2;
		
		if(num==0 || num==1)
		{
			System.out.println("num is not prime no");
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				if(num%i==0)
				{
					System.out.println("num is not prime no");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("num is prime no");
			}
			
			
		}
	
	}
}
	
