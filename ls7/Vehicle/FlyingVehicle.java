package ls7.Vehicle;

public class FlyingVehicle extends Passengers implements Vehicle{

	public FlyingVehicle(int passemgers) {
		super(passemgers);		
		
	}
	
	public void fly() {
		System.out.println("I`m going to take off");
	}
	
	public void land() {
		System.out.println("I`m going to land");
	}

}
