package com.softserve.javacore;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int passangers, int maxSpeed) {
        super(passangers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is driving.");

    }

    @Override
    public void run() {
        drive();
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                ", passengers=" + getPassangers() +
                "}";
    }
}
