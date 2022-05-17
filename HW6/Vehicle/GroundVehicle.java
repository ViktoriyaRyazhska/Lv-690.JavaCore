package HomeWork.Vehicle;

public abstract class  GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passenger) {
        super(passenger);
    }

    public void drive() {
        System.out.println("On road");
    }

    public void getInfo() {

    }
}
