package com.numbers.prog;

public class TryEnc {
	private double balance;
	
	public void setBalance(double balance)
	{
		if(balance<=0) 
		{
			System.out.println("Do not enter -Ve balance");
		}
		else {
			balance=this.balance;
		}
	}
	public double getBalance()
	{
		return balance;
	}

}

class BankTry{
	public static void main(String[] args) 
	{
		TryEnc tryEnc = new TryEnc();
		tryEnc.setBalance(5000);
		System.out.println("Balance is-->>"+tryEnc.getBalance());
	}
}
