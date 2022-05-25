package work6.task2;

public abstract class GroundVehicle extends Passengers implements Vehicle{
	public GroundVehicle(int passenger) {
        super(passenger);
    }

    public abstract void drive();
}
