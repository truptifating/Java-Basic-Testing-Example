package com.test;

abstract class Bus
{
    abstract void engine();
    
    public void wheels()
    {
        System.out.println("4 wheels");
    }
}

public class TotalAbstraction extends Bus {
	void engine()
	{
		System.out.println("Engine is updated");
	}

	public static void main(String[] args) 
	{
		
		TotalAbstraction t= new TotalAbstraction();
		t.engine();
		t.wheels();
	}

}
