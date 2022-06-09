package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        Car car1 = new Car(CarType.SEDAN, 2020, 2200);
        Car car2 = new Car(CarType.HATCHBACK, 2020, 1600);
        Car car3 = new Car(CarType.SUV, 2015, 3000);
        Car car4 = new Car(CarType.CABRIO, 2022, 2000);

        Car[] cars = {car1, car2, car3, car4};

        System.out.println("Original array of cars:");
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);
        System.out.println("Sorted by production year:");
        System.out.println(Arrays.toString(cars));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter production year:");
            int prodYear = Integer.parseInt(br.readLine());
            Car.listByYear(prodYear, cars);
        }
        catch (NumberFormatException ex) {
            System.out.println("Please provide valid year");
            System.out.println(ex.getMessage());
        }

    }

}
