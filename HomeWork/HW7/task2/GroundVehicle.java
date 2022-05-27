package HW7.task2;


public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passangers) {
        super(passangers);
    }

    public void drive() {
        System.out.println("I can drive");
    }
}