package Homework.lesson7.task2;

public class GroundVehicle extends Passagers implements Vehicle{

    public GroundVehicle(int pasagers) {
        super(pasagers);
    }

    public void drive() {
        System.out.println("Driving");
    }
}
