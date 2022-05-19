package ls6.Task6;

public class Sedan extends Car {
	private int passengerCapacity;

	public Sedan(String model, int maxSpeed, int yearOfManufacture, int passengerCapacity) {
		super(model, maxSpeed, yearOfManufacture);
		this.setPassengerCapacity(passengerCapacity);
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}


	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}	
	

	@Override
	public String run() {		
		return getModel() + " running";
	}

	@Override
	public String stop() {
		return getModel() + " stoped";
	}

	@Override
	public String toString() {
		return "Sedan [passengerCapacity=" + passengerCapacity + ", Model()=" + getModel() + ", MaxSpeed()="
				+ getMaxSpeed() + ", YearOfManufacture()=" + getYearOfManufacture() + "]";
	}


	
	
	
}
