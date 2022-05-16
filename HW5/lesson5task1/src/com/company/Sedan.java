package com.company;

public class Sedan extends Car {
    public void run(){
        System.out.println("Sedan is running");
    }

    public void stop(){
        System.out.println("Sedan stopped");
    }

    public Sedan(String model, int maxSpeed, int yearOfManufacture){
        super (model, maxSpeed, yearOfManufacture);
    }
}
