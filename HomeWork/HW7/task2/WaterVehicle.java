package HW7.task2;

public class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passangers) {
        super(passangers);
    }

    public void isSailling() {
        System.out.println("isSailling");
    }
}