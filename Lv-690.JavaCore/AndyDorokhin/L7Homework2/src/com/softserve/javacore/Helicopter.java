package com.softserve.javacore;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int passangers, int weight, int maxHeight) {
        super(passangers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying.");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing.");
    }

    @Override
    public void run() {
        fly();
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                ", passengers=" + getPassangers() +
                "}";
    }
}
