package Homework.lesson7.task2;

public class FlyingVehicle extends Passagers implements Vehicle {
    public FlyingVehicle(int pasagers) {
        super(pasagers);
    }
    public void fly() {
        System.out.println("Taking off");
    }

    public void land() {
        System.out.println("Landing");
    }
}
