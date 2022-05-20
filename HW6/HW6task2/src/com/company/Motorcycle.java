package com.company;

public class Motorcycle extends GroungVehicle{
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed){
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        super.drive();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void information(){
        System.out.println("MOTORCYCLE     number of passengers : " + getPassengers() + ", mas speed : " + maxSpeed);
    }
}

