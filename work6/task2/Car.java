package work6.task2;

public class Car extends GroundVehicle {
	String model;

	public Car(int passenger, String model) {
		super(passenger);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void drive() {
		System.out.println("car goes");

	}

}
