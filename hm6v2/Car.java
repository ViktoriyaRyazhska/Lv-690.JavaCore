package hm6v2;

public class Car extends GroundVehicle {
	private int maxSpeed;

	public Car(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
public void drive() {
		
	}
}
