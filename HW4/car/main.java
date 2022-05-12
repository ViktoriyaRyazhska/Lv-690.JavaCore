package car;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        car car1 = new car("Sedan", 1986, "Five Cylinder");
        car car2 = new car("Hatchback", 2013, "Six Cylinder");
        car car3 = new car("Coupe", 1995, "Four Cylinder");
        car car4 = new car("Crossover", 2013, "Five Cylinder");

        car[] cars = {car1, car2, car3, car4};

        yearFinder(cars);
        System.out.println("----------");
        sortCarByYear(cars);

    }

    public static void yearFinder(car[] cars) {
        car[] carsArray = cars;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input year of car ");
        int year = Integer.parseInt(sc.next());

        for (int i = 0; i < carsArray.length; i++) {

            if (year == carsArray[i].year) {
                System.out.println(carsArray[i]);
            }

        }

    }

    public static void sortCarByYear(car[] cars) {
        car[] carsArray = cars;
        car tmpYear;


        for (int i = 0; i < carsArray.length - 1; i++) {
            for (int j = i + 1; j < carsArray.length; j++) {
                if (carsArray[i].year < carsArray[j].year) {
                    tmpYear = carsArray[i];
                    carsArray[i] = carsArray[j];
                    carsArray[j] = tmpYear;
                }
            }
        }
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i].getInfo());
        }

    }
}
