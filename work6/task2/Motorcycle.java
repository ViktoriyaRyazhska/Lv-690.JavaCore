package work6.task2;

public class Motorcycle extends GroundVehicle {
	int maxSpeed;

	public Motorcycle(int passenger, int maxSpeed) {
		super(passenger);
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
		System.out.println("motorcycle goes");

	}

}
