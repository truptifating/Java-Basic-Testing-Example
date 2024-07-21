package com.test;

public class AbstExVolvo extends AbstractExBus 
{
 void engine()
 {
	 System.out.println("Capacity is 80kmph");
 }
	public static void main(String[] args) 
	{
		AbstExVolvo bus2= new AbstExVolvo();
		bus2.breaks();
		bus2.engine();
		bus2.wheels();

	}

}
