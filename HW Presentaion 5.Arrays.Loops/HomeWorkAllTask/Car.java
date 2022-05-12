// 4   Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//        certain model year  (enter year in the console);
//        ordered by the field year.

package HomeWorkAllTask;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    String name;
    int yearOfProduction;
    double engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public Car(String name, int yearOfProduction, double engine) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2012, 3);
        Car c2 = new Car("Lexus", 2020, 2.5);
        Car c3 = new Car("Audi", 2021, 3);
        Car c4 = new Car("Bmw", 2014, 4);
        Car c5 = new Car("Mercedes", 2017, 3);

        Car[] auto = {c1, c2, c3, c4, c5};
        findYearProduction(auto);
        sortByYear(auto);

    }

    public static void findYearProduction(Car[] auto) {
        Scanner sc = new Scanner(System.in);
        Car[] arrays = auto;
        System.out.println("Enter the year of production:::");
        int input = sc.nextInt();
        boolean guess = false;
        for (int i = 0; i < auto.length; i++) {
            if (input == arrays[i].yearOfProduction) {
                System.out.println(arrays[i]);
                guess = true;
            }
        }
        if (guess == false) {
            System.out.println("Wrong year of production");
        }

    }

    public static void sortByYear(Car[] auto) {
        Car[] arrays = auto;
        String tmpName;
        int tmpYear;
        double tmpEngine;
        System.out.println("Sort by Yaer desc:::");
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i].getYearOfProduction() < arrays[j].getYearOfProduction()) {
                    tmpName = arrays[i].name;
                    tmpYear = arrays[i].yearOfProduction;
                    tmpEngine = arrays[i].engine;
                    arrays[i].yearOfProduction = arrays[j].yearOfProduction;
                    arrays[i].engine = arrays[j].engine;
                    arrays[i].name = arrays[j].name;
                    arrays[j].yearOfProduction = tmpYear;
                    arrays[j].engine = tmpEngine;
                    arrays[j].name = tmpName;
                }
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
