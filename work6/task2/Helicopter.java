package work6.task2;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHeight;
	

	public Helicopter(int passenger, int weight, int maxHeight) {
		super(passenger);
		this.weight = weight;
		this.maxHeight = maxHeight;
	}

	@Override
	public void fly() {
		System.out.println("helicopter fly");
	}

	@Override
	public void land() {
		System.out.println("helicopter land");
	}

	public void info() {
        System.out.println("passengers amount:"+getPassengers()+", weight:" + weight+", max height: "+maxHeight);
 }
}
