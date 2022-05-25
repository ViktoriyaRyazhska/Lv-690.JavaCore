package work6.task2;

public class Liner extends WaterVehicle {
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
	
	@Override
	public void isSailing() {
		System.out.println("liner floats in the ocean");
	}
	
	 public void info() {
	        System.out.println("passengers amount:"+getPassengers()+", floors amount:" + getFloors());
	 }

}
