package work6.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
	public FlyingVehicle(int passenger) {
        super(passenger);
    }

    public abstract void fly();
    public abstract void land();
}
