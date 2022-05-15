package Homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Car {

    private int yearOfProduction;
    private CarType type;
    private double engineCap;
    private static Car[] cars = new Car[4];
    private static Scanner scanner = new Scanner(System.in);

    public Car(int yearOfProduction, CarType type, double engineCap) {
        this.yearOfProduction = yearOfProduction;
        this.type = type;
        this.engineCap = engineCap;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction() {
        System.out.println("Print year of production");
        this.yearOfProduction = scanner.nextInt();
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    public static void carsByYear() {
        int year = scanner.nextInt();
        for (Car elem : cars) {
            if (elem.yearOfProduction == year) {
                System.out.println(elem);
            }
        }
    }

    public static void arraySort() {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearOfProduction < cars[j].yearOfProduction) {
                    Car x;
                    x = cars[i];
                    cars[i] = cars[j];
                    cars[j] = x;
                }
            }
        }
    }

    public String toString() {
        return ("This car was produced: " + this.yearOfProduction + "\n body type: " + this.type +
                "\n engine capacity : " + this.engineCap);
    }

    public static void main(String[] args) {
        Car c1 = new Car(1999, CarType.WAGON, 2.5);
        Car c2 = new Car(1999, CarType.COUPE, 3.0);
        Car c3 = new Car(2016, CarType.SEDAN, 2.0);
        Car c4 = new Car(2017, CarType.SUV, 2.0);

        cars[0] = c1;
        cars[1] = c2;
        cars[2] = c3;
        cars[3] = c4;

        Car.carsByYear();
        Car.arraySort();
        System.out.println(Arrays.toString(cars));
        c2.setYearOfProduction();
        Car.arraySort();
        System.out.println(Arrays.toString(cars));

    }
}
