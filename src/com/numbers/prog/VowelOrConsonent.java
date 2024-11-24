package com.numbers.prog;

public class VowelOrConsonent {

	public static void main(String[] args) {
char ch='b';
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Char is vowel");
        }
        else
        if(ch<'z'||ch>'a'||ch>'A'||ch<'Z')
        {
            System.out.println("Char is consonent");
        }
	}

}
