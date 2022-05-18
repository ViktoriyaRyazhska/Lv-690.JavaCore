/*Create class Car with fields type, year of production and engine capacity.
Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year. */

package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    String type;
    int year;
    double engineCapacity;


    void showInfo() {
        System.out.println("type: " + type + " year of production: " + year + " engine capacity: " + engineCapacity);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Car car1 = new Car();
        car1.type = "Audi A7";
        car1.year = console.nextInt();
        car1.engineCapacity = 3.8;
        car1.showInfo();

        Car car2 = new Car();
        car2.type = "Audi A6";
        car2.year = console.nextInt();
        car2.engineCapacity = 4.2;
        car2.showInfo();

        Car car3 = new Car();
        car3.type = "Audi A5";
        car3.year = console.nextInt();
        car3.engineCapacity = 2.5;
        car3.showInfo();

        Car car4 = new Car();
        car4.type = "Audi A4";
        car4.year = console.nextInt();
        car4.engineCapacity = 3.9;
        car4.showInfo();

        Car[] arrayCar = {car1, car2, car3, car4};
        Car tmp;
        for (int i = 0; i < arrayCar.length - 1; i++) {
            for (int j = i + 1; j < arrayCar.length; j++) {
                if (arrayCar[i].year < arrayCar[j].year) {
                    tmp = arrayCar[i];
                    arrayCar[i] = arrayCar[j];
                    arrayCar[j] = tmp;
                }
            }

        }
        for (Car car : arrayCar) {
            car.showInfo();

        }
    }
}

