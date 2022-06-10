package hm6v2;

public class Motorcycle extends GroundVehicle {
	private int model;

	public Motorcycle(int passengers, int model) {
		super(passengers);
		this.model = model;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
public void drive() {
		
	}
}
