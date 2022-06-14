package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {

        Wrapper<Integer> intWrapper = new Wrapper<>(99);
        System.out.println("Value inside Integer Wrapper: " + intWrapper.getValue());
        Wrapper<String> stringWrapper = new Wrapper<>("Hello Java!");
        System.out.println("Value inside String Wrapper: " + stringWrapper.getValue());
        Wrapper<Boolean> booleanWrapper = new Wrapper<>(true);
        System.out.println("Value inside Boolena Wrapper: " + booleanWrapper.getValue());
    }
}
