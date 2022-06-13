package com.softserve.javacore;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passangers, int maxDistance) {
        super(passangers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing.");
    }

    @Override
    public void run() {
        fly();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                ", passengers=" + getPassangers() +
                "}";
    }
}
