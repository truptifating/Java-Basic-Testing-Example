package com.test;

public class AbstExRedbus extends AbstractExBus 
{
void engine()
{
	System.out.println("Capacity is 40kmph");
	}
	public static void main(String[] args) 
	{
		AbstExRedbus bus1= new AbstExRedbus();
		bus1.breaks();
		bus1.wheels();
		bus1.engine();

	}

}
