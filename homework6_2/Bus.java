package homework6_2;

public class Bus extends GroundVehicle{
	private int route;

	public Bus(int passengers, int route) {
		super(passengers);
		this.route = route;
	}

	public int getRoute() {
		return route;
	}

	public void setRoute(int route) {
		this.route = route;
	}
	public void drive(){
		
	}
}
