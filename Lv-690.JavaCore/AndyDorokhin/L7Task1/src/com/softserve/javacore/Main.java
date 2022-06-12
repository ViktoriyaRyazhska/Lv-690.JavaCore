package com.softserve.javacore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal1 = new Cat("Tim", "Domestic short-haired", 5);
        Animal animal2 = new Cat("Sid", "Sphynx", 3);
        Animal animal3 = new Dog("Rex", "Labrador Retriever", 4);
        Animal animal4 = new Dog("Nike", "German Shepherd", 2);


        List<Animal> animals = List.of(animal1, animal2, animal3, animal4);
        for(Animal animal : animals) {
            System.out.println(animal);
            animal.voice();
            animal.feed();
        }
    }
}
