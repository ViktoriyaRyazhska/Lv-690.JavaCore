package com.softserve.javacore;

public class Truck extends Car{

    private CabinType cabin;
    private boolean fourWheelDrive;
    private int towingCapacity;

    public Truck() {};


    public Truck(String model, int maxSpeed, int yearOfManufacture, CabinType cabin, boolean fourWheelDrive, int towingCapacity) {
        super(model, maxSpeed, yearOfManufacture);
        this.cabin = cabin;
        this.fourWheelDrive = fourWheelDrive;
        this.towingCapacity = towingCapacity;
    }

    public CabinType getCabin() {
        return cabin;
    }

    public void setCabin(CabinType cabin) {
        this.cabin = cabin;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        if (fourWheelDrive != truck.fourWheelDrive) return false;
        if (towingCapacity != truck.towingCapacity) return false;
        return cabin == truck.cabin;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cabin != null ? cabin.hashCode() : 0);
        result = 31 * result + (fourWheelDrive ? 1 : 0);
        result = 31 * result + towingCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cabin=" + cabin +
                ", fourWheelDrive=" + fourWheelDrive +
                ", towingCapacity=" + towingCapacity +
                "} " + super.toString();
    }

    @Override
    public void run() {
        System.out.println(String.format("Truck %s is running", getModel()));

    }

    @Override
    public void stop() {
        System.out.println(String.format("Truck %s is stopping", getModel()));
    }

}
