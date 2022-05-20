package com.company;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers , int maxDistance){
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {
        super.fly();
    }

    @Override
    void land() {
        super.land();
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void information(){
        System.out.println("PLANE     number of passengers : " + getPassengers() + ", max distance : " + maxDistance);
    }
}
