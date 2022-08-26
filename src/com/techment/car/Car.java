package com.techment.car;

public class Car
{
	private int Speed = 0;
	private String Make = "";
	private int yearModel = 0;
		
	public Car (String n, int Model)
	{	
		Make = n;
		yearModel = Model; 
	}
	
	public int getyearModel ()
	{
		return yearModel;
	}
	
	public String getMake ()
	{
		return Make;
	}
	
	public int getSpeed ()
	{
		return Speed;
	}	
		
	public void accelerate ()
	{
		if (Speed !=100)
			Speed = Speed +20;
			System.out.println("Current speed is: "+Speed);
	}
	
	public void brake ()
	{
		if (Speed !=0)
			Speed = Speed -10;
			System.out.println("Current speed is: "+Speed);
	}
}
