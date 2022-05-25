package work6.task2;

public class Bus extends GroundVehicle {
private String rout;

	public Bus(int passenger, String rout) {
	super(passenger);
	this.rout = rout;
}

	
	public String getRout() {
		return rout;
	}


	public void setRout(String rout) {
		this.rout = rout;
	}


	@Override
	public void drive() {
		System.out.println("bus goes");
		
		
	}

}
