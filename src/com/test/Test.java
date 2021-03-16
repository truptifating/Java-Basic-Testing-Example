package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.KeySelectorResult;

public class Test 
{

	public static void main(String[] args) 
	{
	   	   String cityname[]= {"abc","xyz","123"};
	   	   
	   	   System.out.println("Citynames are-->"+Arrays.toString(cityname));
	   	   
	   	   ArrayList<String> obj= new ArrayList<>(Arrays.asList(cityname));
	   	   System.out.println(obj);
	   	   
	   	   obj.add("Trupti");
	   	   obj.add("hjk");
	   	System.out.println(obj);
	}
}
	
