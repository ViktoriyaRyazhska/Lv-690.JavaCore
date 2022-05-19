package ls6.Task6;

public class Truck extends Car {
	private int loadCapacity;
	

	public Truck(String model, int maxSpeed, int yearOfManufacture, int loadCapacity) {
		super(model, maxSpeed, yearOfManufacture);
		this.loadCapacity = loadCapacity;
	}
	
	public int getLoadCapacity( ) {
		return loadCapacity;
	}
	
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public String run() {
		return getModel() + " running";
		
	}

	@Override
	public String stop() {
		return getModel() + " stopped";
		
	}

	@Override
	public String toString() {
		return "Truck [loadCapacity=" + loadCapacity + ", Model()=" + getModel() + ", MaxSpeed()=" + getMaxSpeed()
				+ ", YearOfManufacture()=" + getYearOfManufacture() + "]";
	}

	
	
	
}
