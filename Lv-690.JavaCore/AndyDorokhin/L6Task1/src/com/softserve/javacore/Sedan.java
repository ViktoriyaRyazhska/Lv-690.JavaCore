package com.softserve.javacore;

public class Sedan extends Car{

    private int trunkVolume;
    private boolean captainSeats;

    public Sedan() {};

    public Sedan(String model, int maxSpeed, int yearOfManufacture, int trunkVolume, boolean captainSeats) {
        super(model, maxSpeed, yearOfManufacture);
        this.trunkVolume = trunkVolume;
        this.captainSeats = captainSeats;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public boolean isCaptainSeats() {
        return captainSeats;
    }

    public void setCaptainSeats(boolean captainSeats) {
        this.captainSeats = captainSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Sedan sedan = (Sedan) o;

        if (trunkVolume != sedan.trunkVolume) return false;
        return captainSeats == sedan.captainSeats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + trunkVolume;
        result = 31 * result + (captainSeats ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "trunkVolume=" + trunkVolume +
                ", captainSeats=" + captainSeats +
                "} " + super.toString();
    }

    @Override
    public void run() {
        System.out.println(String.format("Sedan %s is running", getModel()));

    }

    @Override
    public void stop() {
        System.out.println(String.format("Sedan %s is stopping", getModel()));
    }
}
