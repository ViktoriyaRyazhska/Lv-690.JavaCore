package ls7.Vehicle;

public class Helicopter extends FlyingVehicle{
	private int weight;
	private int maxHeight;
	
	public Helicopter(int passemgers, int weight, int maxHeight) {
		super(passemgers);
		this.weight = weight;
		this.maxHeight = maxHeight;
	}

	public int getWeight() {
		return weight;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	
	@Override
	public void fly() {
		System.out.println("I take off vertically");
		super.fly();
	}
	

	@Override
	public void land() {
		System.out.println("I land where i want");
		super.land();
	}

	@Override
	public String toString() {
		return "Helicopter [weight=" + weight + ", maxHeight=" + maxHeight + ", getPassemgers()=" + getPassemgers()
				+ "]";
	}
	
	

}
