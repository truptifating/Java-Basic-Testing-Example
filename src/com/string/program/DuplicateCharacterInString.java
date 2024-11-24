package com.string.program;
import java.util.*;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
String t="trupti";
        
        char []a=t.toCharArray();
        System.out.println(Arrays.toString(a));
        
        int length=a.length;
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[j]);
                }
            }
            
        }

	}

}
