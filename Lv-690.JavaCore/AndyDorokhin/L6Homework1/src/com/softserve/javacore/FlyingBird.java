package com.softserve.javacore;

public class FlyingBird extends Bird{

    private int maxAltitude;

    public FlyingBird() {};

    public FlyingBird(String feathers, int layEggs, int maxAltitude) {
        super(feathers, layEggs);
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FlyingBird that = (FlyingBird) o;

        return maxAltitude == that.maxAltitude;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxAltitude;
        return result;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "maxAltitude=" + maxAltitude +
                "} " + super.toString();
    }

    @Override
    public void fly() {
        System.out.println(String.format("%s is flying high", this.getClass().getSimpleName()));
    }
}
