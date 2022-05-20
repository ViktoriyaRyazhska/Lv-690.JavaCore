package com.company;

public class Car extends GroungVehicle{
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        super.drive();
    }

    public void information(){
        System.out.println("CAR     number of passengers : " + getPassengers() + ", model : " + model);
    }
}
