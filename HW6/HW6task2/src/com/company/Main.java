package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Passengers> list = new ArrayList<>();
        list.add(new Boat(10 , 150));
        list.add(new Bus(65 , "Lviv-Kyiv"));
        list.add(new Car(5 , "AUDI"));
        list.add(new Helicopter(4 , 5 , 560));
        list.add(new Liner(500 , 3));
        list.add(new Motorcycle(2 , 180));
        list.add(new Plane(80 , 6000));

        list.sort(new ComparatorPassengers());
        for (Passengers i : list){
            i.information();
        }
    }
}
