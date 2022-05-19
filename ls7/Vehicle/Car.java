package ls7.Vehicle;

public class Car extends GroundVehicle{
	private String model;

	public Car(int passemgers, String model) {
		super(passemgers);
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
		super.drive();
		System.out.println("The car " + model + " is expensive to maintain");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", getPassemgers()=" + getPassemgers() + "]";
	}
	

}
