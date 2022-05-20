package com.company;

public class Cat implements Animal{
    private int age;
    private String name;

    public Cat(int age , String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("miau ^-^");
    }

    @Override
    public void feed() {
        System.out.println("KiteKat");
    }
}
