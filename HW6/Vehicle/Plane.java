package HomeWork.Vehicle;

public class Plane extends FlyingVehicle  {

    private int maxDistance;

    public Plane(int passenger, int maxDistance) {
        super(passenger);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane take off");
    }

    @Override
    public void land() {
        System.out.println("Plane landing");
    }

    @Override
    public void getInfo() {
        System.out.println("Passenger amount :" + getPassenger() +
                " PLane max distance :" + getMaxDistance());

    }
}
