package com.string.program;

public class ReverseWordInString {

	public static void main(String[] args) {
		  String t="Hello World";
	      String reversString="";
	      
	      String []st=t.split(" ");
	      
	      for(int i=0;i<st.length;i++)
	      {
	          
	          String splitedString=st[i];
	          String reverseword="";
	          for(int j=splitedString.length()-1;j>=0;j--)
	          {
	              reverseword=reverseword+splitedString.charAt(j);
	          }
	          
	           reversString=reversString+reverseword;
	           System.out.println(reversString);
	      }
	     

	}

}
