package com.company;

public class NonFlyingBird extends Bird{

    @Override
    public String fly() {
        return "this bird can`t fly";
    }

    public NonFlyingBird(boolean feather , boolean layEggs){
        super (feather , layEggs);
    }
}
