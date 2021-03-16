package com.test;

public class TestEncapsulation 
{
	private double balance;
	  public void setBalance(double balance)
	  {
		 if(balance<=0)
		 {
			 System.out.println("Do not enter negative balanace");
		 }
		 else 
		 {
			 this.balance=balance;
		 }
	  }
	  public double getBalance()
	  {
		  return balance;
	  }
}

class clerk
{
	public static void main(String[] args)
	{
		TestEncapsulation obj1= new TestEncapsulation();
		obj1.setBalance(5000);
		System.out.println("Balance is" +obj1.getBalance());
		
		obj1.setBalance(-5000);
		System.out.println("Balance is" +obj1.getBalance());
	}
}
