package com.company;

import javafx.scene.chart.ChartBuilder;

public class Main {

    public static void main(String[] args) {
        Car car = Car.getCar().addColor("yellow").addEngineOfCapacity(1.6).addModel("BMW").build();
        System.out.println(car.toString());
    }
}
