package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) 
	{
		// Create a list of strings 
        ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear");  // Let us print the sorted list 
        al.add("Is"); 
        al.add("Superb"); 
        
        System.out.println("List before the use of" + 
                " Collection.sort() :\n" + al); 
        
        System.out.println("Size of list is-->"+al.size());
  
        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al); 
        
        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                           " Collection.sort() :\n" + al); 
        
        // Printing the words one by one 
        for(String str:al) 
        {
        	System.out.println(str);
        }   
        
        al.remove("Dear");
        System.out.println("After removing dear"+al);

	}

}
