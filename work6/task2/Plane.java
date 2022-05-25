package work6.task2;

import work5.task1.FlyingBird;

public class Plane extends FlyingVehicle {
	private int maxDistance;
	
	
	public Plane(int passenger, int maxDistance) {
		super(passenger);
		this.maxDistance = maxDistance;
	}
	
	
	public int getMaxDistance() {
		return maxDistance;
	}
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}


	@Override
	public void fly() {
		System.out.println("plane fly");
	}

	@Override
	public void land() {
		System.out.println("plane land");
	}
	
	public void info() {
        System.out.println("passengers amount:"+getPassengers()+", max distance:" + getMaxDistance());
 }

}
