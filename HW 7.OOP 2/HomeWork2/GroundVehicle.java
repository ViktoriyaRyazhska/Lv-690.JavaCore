package HomeWork2;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int pasangers) {
        super(pasangers);
    }

    public void drive() {
        System.out.println("I can drive");
    }
}
