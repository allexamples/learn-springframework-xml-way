package com.wellnwill.learn.spingframework.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wellnwill/learn/spingframework/ioc/spring-cfg.xml");
		Car car = context.getBean("car", Car.class);
		car.driveTheCar();
	}
}
