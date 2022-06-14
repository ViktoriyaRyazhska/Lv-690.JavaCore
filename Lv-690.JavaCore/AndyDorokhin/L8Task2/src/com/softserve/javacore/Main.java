package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	
        Wrapper<Shape> squareWrapper = new Wrapper<>(new Square());
        System.out.println(squareWrapper);
        System.out.println("Object type Inside wrapper: " + squareWrapper.getShape().getClass().getSimpleName());

        Wrapper<Shape> circleWrapper = new Wrapper<>(new Circle());
        System.out.println(circleWrapper);
        System.out.println("Object type Inside wrapper: " + circleWrapper.getShape().getClass().getSimpleName());

        // Wrapper<String> test = new Wrapper<>("Hello");
    }
}
