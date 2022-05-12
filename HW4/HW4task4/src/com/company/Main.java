package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Car tmp;
    System.out.println("Enter year Of Production: ");
    int a = sc.nextInt();
    List<Car> list = new ArrayList();
    list.add(new Car("Sedan" , 1999 , 1.6));
    list.add(new Car("Hatchback" , 2006 , 2.0));
    list.add(new Car("Liftback" , 2000 , 1.8));
    list.add(new Car("Coupe" , 2003 , 1.8));

    for (Car i : list){
        if (a == i.getYearOfProduction()){
            System.out.println(i.getType() + " " + i.getEngineCapacity());
        }
    }

        for (int i = 0; i < list.size()-1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if ( list.get(i).getYearOfProduction() < list.get(j).getYearOfProduction() ){
                    tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);

                }
            }
        }

        for (Car i : list){
            System.out.println("Type: " + i.getType() + ", year of production: " + i.getYearOfProduction() + ", engine capacity: " + i.getEngineCapacity());
        }


    }
}
