package ls7.Vehicle;

public class Liner extends WaterVehicle{
	private int floors;

	public Liner(int passemgers, int floors) {
		super(passemgers);
		this.floors = floors;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
		System.out.println("Forvard to the cruise");
	}

	@Override
	public void isSailing() {
		
		super.isSailing();
	}

	@Override
	public String toString() {
		return "Liner [floors=" + floors + ", getPassemgers()=" + getPassemgers() + "]";
	}
	
	

}
