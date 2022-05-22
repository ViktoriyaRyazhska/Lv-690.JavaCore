package Homework8;

import java.util.Date;

public class Car {
	
	private String model;
	private Date dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passangerCapacity;
	private boolean airConditioning;
	private CarBuilder cb;
	
	public Car() {
		this.cb = new CarBuilder(this);
	}
	
	public CarBuilder getCarBuilder() {
		return cb;	}
	

	public class CarBuilder {
		private Car car;
		public CarBuilder(Car car) {
			this.car = car;
		}
		
		public CarBuilder addModel(String model) {
			car.model = model;
			return this;
		}
		public CarBuilder addDateOfProduction(Date dateOfProduction) {
			car.dateOfProduction = dateOfProduction;
			return this;
		}
		public CarBuilder addEngineCapacity(double engineCapacity) {
			car.engineCapacity = engineCapacity;
			return this;
		}
		public CarBuilder addColor(String color) {
			car.color = color;
			return this;
		}
		public CarBuilder addPassangerCapacity(int passangerCapacity) {
			car.passangerCapacity = passangerCapacity;
			return this;
		}
		public CarBuilder addAirConditioning(boolean airConditioning) {
			car.airConditioning = airConditioning;
			return this;
		}
		public Car GetCar() {
			return car;
		}
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passangerCapacity=" + passangerCapacity + ", airConditioning="
				+ airConditioning + "]";
	}


	
		
		
}
