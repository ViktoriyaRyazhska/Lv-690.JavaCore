package hm6v2;

public class Liner extends WaterVehicle  {
	private int floors;

	public Liner(int passengers, int floors) {
		super(passengers);
		this.floors = floors;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}
public void isSailing() {
		
	}

}
