package com.wellnwill.learn.spingframework.di;

public class Car {

	private Engine engine;

	public Car() {
		System.out.println("Car is being built.");
	}

	public void driveTheCar() {
		System.out.println("Driving the car...!");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("Putting engine in the car.");
	}

}
