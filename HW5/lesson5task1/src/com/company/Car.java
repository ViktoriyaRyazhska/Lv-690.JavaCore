package com.company;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public abstract void run();
    public abstract void stop();

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }



    @Override
    public String toString() {
        return "Car{" + "model='" + model + ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }


}
