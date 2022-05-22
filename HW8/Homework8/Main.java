package Homework8;

import Homework8.Car.CarBuilder;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		CarBuilder cb = car.getCarBuilder();
		System.out.println(cb.addModel("BMW").addColor("Red").addPassangerCapacity(5).addEngineCapacity(2500).GetCar());		
	}

}
