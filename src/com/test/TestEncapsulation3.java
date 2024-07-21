package com.test;



class TestEncap
{
private double balance;
    
    public void setBalance(double balance)
    {
        if(balance<=0)
        {
            System.out.println("Do not enter negative balance");
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


public class TestEncapsulation3 {

	public static void main(String[] args) 
	{
		TestEncap ob= new TestEncap();
		ob.setBalance(-5000);
		System.out.println("The balance is-->>"+ob.getBalance());

	}

}
