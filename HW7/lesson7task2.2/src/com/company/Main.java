package com.company;

public class Main {

    public static void main(String[] args) {
    Wrapper<Shape> s1 = new Wrapper<>(new Square());
    Wrapper<Shape> s2 = new Wrapper<>(new Circle());
    }
}
