package HomeWork.Vehicle;

public abstract class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle(int passenger) {
        super(passenger);
    }

    public void fly()
    {
        System.out.println("On sky");
    }
    public void land()
    {
        System.out.println("Landing");
    }
    public void getInfo()
    {

    }
}
