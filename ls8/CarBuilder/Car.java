package ls8.CarBuilder;

import java.time.LocalDate;

public class Car {
	private String model;
	private LocalDate dataOfproduction;
	private double engineCapacity;
	private String color;
	private int passengerCapacity;
	private boolean isAirConditioning;
	
	private Car() {
		
	}
	
	public static CarBuilder getCar() {
		return new Car().new CarBuilder();
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model
				+ ", dataOfproduction=" + dataOfproduction 
				+ ", engineCapacity=" + engineCapacity
				+ ", color=" + color 
				+ ", passengerCapacity=" + passengerCapacity 
				+ ", isAirConditioning=" + isAirConditioning + "]";
	}



	public class CarBuilder {
		private Car car;
		
		public CarBuilder() {
			car = new Car();
		}
		
		public CarBuilder addmodel(String model) {
			car.model = model;
			return this;
		}
		
		public CarBuilder adddataOfproduction(LocalDate dataOfproduction) {
			car.dataOfproduction = dataOfproduction;
			return this;
		}
		
		public CarBuilder addengineCapacity (double engineCapacity) {
			car.engineCapacity = engineCapacity;
			return this;
		}
		
		public CarBuilder addcolor(String color) {
			car.color = color;
			return this;
		}
		
		public CarBuilder addpassengerCapacity(int passengerCapacity) {
			car.passengerCapacity = passengerCapacity;
			return this;
		}
		
		public CarBuilder addisAirConditioning(boolean isAirConditioning) {
			car.isAirConditioning = isAirConditioning;
			return this;
		}
		
		public Car build() {
			return car;
		}
	}
}
