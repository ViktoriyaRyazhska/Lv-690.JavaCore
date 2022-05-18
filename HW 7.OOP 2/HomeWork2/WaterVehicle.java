package HomeWork2;

public class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int pasangers) {
        super(pasangers);
    }

    public void isSailling() {
        System.out.println("isSailling");
    }
}
