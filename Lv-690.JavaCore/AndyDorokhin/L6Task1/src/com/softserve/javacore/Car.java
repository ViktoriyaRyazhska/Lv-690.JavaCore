package com.softserve.javacore;

public abstract class Car {


    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car() {};

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (maxSpeed != car.maxSpeed) return false;
        if (yearOfManufacture != car.yearOfManufacture) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + maxSpeed;
        result = 31 * result + yearOfManufacture;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public abstract void run();

    public abstract void stop();

}
