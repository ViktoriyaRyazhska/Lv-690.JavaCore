package ls7.Vehicle;

public class Bus extends GroundVehicle{
	private String route;

	public Bus(int passemgers, String route) {
		super(passemgers);	
		this.route = route;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public void drive() {
		System.out.println("The bus gouses on the route " + route);
		super.drive();
	}

	@Override
	public String toString() {
		return "Bus [route=" + route + ", getPassemgers()=" + getPassemgers() + "]";
	}
	
	
}
