package hm6v2;

public class Bus extends GroundVehicle {
	private String route;

	public Bus(int passengers, String route) {
		super(passengers);
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
public void drive() {
		
	}
}
