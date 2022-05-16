package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList();
        cars.add(new Truck("Ford" , 220 , 1999));
        cars.add(new Truck("Suzuki" , 260 , 2007));
        cars.add(new Sedan("Renault" , 180 , 1989));
        cars.add(new Sedan("Volkswagen" , 280 , 2010));

        for (Car i : cars){
            System.out.println(i);
        }
    }
}
