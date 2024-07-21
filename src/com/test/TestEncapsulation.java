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

