package com.company;



public abstract class Bird {
    private boolean feather;
    private boolean layEggs;

    public abstract String fly();

    public Bird(boolean feather , boolean layEggs){
        this.feather = feather;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird { " +
                " fathers = ' " + feather + '\'' +
                " , layEggs = " + layEggs +
                '}';
    }
}
