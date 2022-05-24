package homework6_2;

public class Car extends GroundVehicle{
	private String model;

	public Car(int passengers, String model) {
		super(passengers);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public void drive() {
		
	}
}
