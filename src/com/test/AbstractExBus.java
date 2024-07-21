package com.test;

public abstract class AbstractExBus 
{
  abstract void engine();
  void breaks()
  {
	  System.out.println("Breaks applied bus stopped");
  }
  void wheels()
  {
	  System.out.println("Bus will stop on 4 wheels");
  }
}



