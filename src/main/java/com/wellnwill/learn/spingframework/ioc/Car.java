package com.wellnwill.learn.spingframework.ioc;

import com.wellnwill.learn.spingframework.di.Engine;

public class Car {

	public Car() {
		System.out.println("Car is being built.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...!");
	}
}
