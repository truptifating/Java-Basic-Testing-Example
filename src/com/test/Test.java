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
	private double balance;
	
	public void setBalance(double balance)
	{
		if(balance<=0)
		{
			System.out.println("DO not enter negative balance");
		}
		else
		{
			balance=this.balance;
		}
	}
	public double getBalanace()
	{
		return balance;
	}
}


	
