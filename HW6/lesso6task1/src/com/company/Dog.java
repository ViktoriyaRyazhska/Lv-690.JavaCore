package com.company;

public class Dog implements Animal{
    private int age;
    private String name;

    public Dog(int age , String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    public void feed() {
        System.out.println("Royal Canin");
    }
}
