package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Animal> list = new ArrayList();

    list.add(new Cat(2 , "c1"));
    list.add(new Cat(3 , "c2"));
    list.add(new Dog(4 , "d1"));
    list.add(new Dog(4 , "d2"));

    for (Animal i : list){
        i.feed();
        i.voice();
    }

    }
}
