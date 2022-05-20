package com.company;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers , int weight , int maxHeight){
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        super.fly();
    }

    @Override
    void land(){
        super.land();
    }

    public void information(){
        System.out.println("HELICOPTER     number of passengers : " + getPassengers() + ", weight : " + weight + ", max height : " + maxHeight);
    }
}
