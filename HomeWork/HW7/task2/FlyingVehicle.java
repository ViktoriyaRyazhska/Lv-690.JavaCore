package HW7.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passangers) {
        super(passangers);
    }

    public void fly() {
        System.out.println("Can fly");
    }

    public void land() {
        System.out.println("land");
    }

}
