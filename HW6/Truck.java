package Homework6;

public class Truck extends Car {
	Truck(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);		
	}
	
	@Override
	public String toString() {
		return "Truck [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
