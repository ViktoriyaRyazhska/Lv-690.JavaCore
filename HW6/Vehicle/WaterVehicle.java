package HomeWork.Vehicle;

public abstract class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passenger) {
        super(passenger);
    }

    public void isSailing()
    {
        System.out.println("isSailing");
    }

    public void getInfo()
    {

    }
}
