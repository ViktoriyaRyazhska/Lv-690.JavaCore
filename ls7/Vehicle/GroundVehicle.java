package ls7.Vehicle;

public class GroundVehicle extends Passengers implements Vehicle{

	public GroundVehicle(int passemgers) {
		super(passemgers);		
	}
	
	public void drive() {
		System.out.println("The Vehicle start draving");
	}
	
}
