package com.softserve.javacore;

public class Car extends GroundVehicle{
    private String model;

    public Car(int passangers, String model) {
        super(passangers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");

    }

    @Override
    public void run() {
        drive();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", passengers=" + getPassangers() +
                "}";
    }
}
