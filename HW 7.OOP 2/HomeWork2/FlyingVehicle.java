package HomeWork2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int pasangers) {
        super(pasangers);
    }

    public void fly() {
        System.out.println("Can fly");
    }

    public void land() {
        System.out.println("land");
    }

}
