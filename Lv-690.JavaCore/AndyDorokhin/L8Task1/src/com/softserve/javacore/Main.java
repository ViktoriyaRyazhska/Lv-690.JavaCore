package com.softserve.javacore;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car.CarBuilder builder = new Car.CarBuilder();
        builder.addModel("Subaru XV").addDateOfProduction(LocalDate.of(2020, 1, 1)).addEngineCapacity(2000).addColor("Quartz Blue");
        Car myCar = builder.build();
        System.out.println(myCar);

    }
}
