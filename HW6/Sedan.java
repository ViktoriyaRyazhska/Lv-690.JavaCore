package Homework6;

public class Sedan extends Car {
	Sedan(String model, int maxSpeed, int yearOfManufacture) {
		super(model, maxSpeed, yearOfManufacture);		
	}

	@Override
	public String toString() {
		return "Sedan [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

}
