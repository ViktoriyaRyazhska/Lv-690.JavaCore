package ls7.Vehicle;

public class WaterVehicle extends Passengers implements Vehicle{

	public WaterVehicle(int passemgers) {
		super(passemgers);		
	}
	
	public void isSailing() {
		System.out.println("Spread the sails");
	}

}
