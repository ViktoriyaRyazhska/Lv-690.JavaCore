package ls7.Vehicle;

public class Motorcycle extends GroundVehicle{
	private int maxSpeed;

	public Motorcycle(int passemgers, int maxSpeed) {
		super(passemgers);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void drive() {		
		super.drive();
		System.err.println("It`s great to ride a motorcycle.");
	}

	@Override
	public String toString() {
		return "Motorcycle [maxSpeed=" + maxSpeed + ", getPassemgers()=" + getPassemgers() + "]";
	}
	

}
