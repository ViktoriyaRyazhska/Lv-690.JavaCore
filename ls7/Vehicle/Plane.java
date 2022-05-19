package ls7.Vehicle;

public class Plane extends FlyingVehicle{
	private int maxDistance;
	
	public Plane(int passemgers, int maxDistance) {
		super(passemgers);
		this.maxDistance = maxDistance;
	}
	
	public int getMaxDistance() {
		return maxDistance;
	}
	
	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	
	@Override
	public void fly() {		
		super.fly();
		System.out.println("The flight will be comfortable");
	}
	

	@Override
	public void land() {		
		super.land();
		System.out.println("The flight was great");		
	}

	@Override
	public String toString() {
		return "Plane [maxDistance=" + maxDistance + ", getPassemgers()=" + getPassemgers() + "]";
	}
	

	
	

}
