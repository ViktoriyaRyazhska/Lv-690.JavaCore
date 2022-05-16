package com.company;

public class FlyingBird extends Bird{
    @Override
    public String fly() {
        return "this bird can fly";
    }
        public FlyingBird(boolean feather , boolean layEggs){
            super (feather , layEggs);
        }

}
