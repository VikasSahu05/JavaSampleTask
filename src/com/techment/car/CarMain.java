package com.techment.car;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("volvo", 1965);
		
		int getModel = car.getyearModel();
		String make = car.getMake();
		System.out.println("Car Model : "+getModel);
		System.out.println("Car Make : "+make);
		
		
		for (int i = 1; i <= 5; i++)
		{
			car.accelerate();
		}
		System.out.println("After Break");
		for (int j = 1; j <= 5; j++)
		{
			car.brake();
		}

	}

}
