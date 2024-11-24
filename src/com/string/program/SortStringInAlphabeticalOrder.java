package com.string.program;
import java.util.*;

public class SortStringInAlphabeticalOrder {

	public static void main(String[] args) {
String t="trupti";
        
        char []a=t.toCharArray();
        System.out.println(Arrays.toString(a));
        
      
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
	}

}
