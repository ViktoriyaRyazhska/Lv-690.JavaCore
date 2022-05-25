package work6.task2;

public class Boat extends WaterVehicle {
	private int volumes;
	
	
	public Boat(int passengers, int volumes) {
		super(passengers);
		this.volumes = volumes;
	}
	
	
	public int getVolumes() {
		return volumes;
	}
	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}
	
	
	@Override
	public void isSailing() {
		System.out.println("liner floats in the lake");
	}
	
	public void info() {
        System.out.println("passengers amount:"+getPassengers()+", volumes amount:" + getVolumes());
 }

}
