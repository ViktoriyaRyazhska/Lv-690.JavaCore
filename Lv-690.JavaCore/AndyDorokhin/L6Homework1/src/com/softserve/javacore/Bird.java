package com.softserve.javacore;

public abstract class Bird {

    private String feathers;
    private int layEggs;

    public Bird() {};

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (layEggs != bird.layEggs) return false;
        return feathers != null ? feathers.equals(bird.feathers) : bird.feathers == null;
    }

    @Override
    public int hashCode() {
        int result = feathers != null ? feathers.hashCode() : 0;
        result = 31 * result + layEggs;
        return result;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }

    public abstract void fly();


}
