package HW5;

import java.util.Scanner;

public class CarMain {


public static void main(String[] args) {
Car c1 = new Car("Skoda", 2012, 1.9);
Car c2 = new Car("VW", 2020, 2.0);
Car c3 = new Car("Audi", 2021, 2.6);
Car c4 = new Car("Bmw", 2014, 3.6);
Car c5 = new Car("Mercedes", 2017, 3);

Car[] auto = {c1, c2, c3, c4, c5};
findYearProduction(auto);
sortByYear(auto);

}

public static void findYearProduction(Car[] auto) {
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
Car[] arrays = auto;
System.out.println("Enter the year of production: ");
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
String carsName;
int carsYear;
double carsEngine;
System.out.println("Sort by Year desc:");
for (int i = 0; i < arrays.length - 1; i++) {
  for (int j = i + 1; j < arrays.length; j++) {
      if (arrays[i].getYearOfProduction() < arrays[j].getYearOfProduction()) {
    	  carsName = arrays[i].name;
    	  carsYear = arrays[i].yearOfProduction;
    	  carsEngine = arrays[i].engine;
          arrays[i].yearOfProduction = arrays[j].yearOfProduction;
          arrays[i].engine = arrays[j].engine;
          arrays[i].name = arrays[j].name;
          arrays[j].yearOfProduction = carsYear;
          arrays[j].engine = carsEngine;
          arrays[j].name = carsName;
      }
  }
}
for (int i = 0; i < arrays.length; i++) {
  System.out.println(arrays[i]);
}
}
}