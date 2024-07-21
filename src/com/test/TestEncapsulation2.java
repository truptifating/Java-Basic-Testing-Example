package com.test;

public class TestEncapsulation2 {

	public static void main(String[] args) {
		TestEncapsulation obj1= new TestEncapsulation();
		obj1.setBalance(5000);
		System.out.println("Balance is" +obj1.getBalance());
		
		obj1.setBalance(-5000);
		System.out.println("Balance is" +obj1.getBalance());
	}

}
