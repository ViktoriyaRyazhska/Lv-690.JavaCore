package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Person> list = new ArrayList<>();
    list.add(new Student("Artem" , "Lysiak" , 22 , 4));
    list.add(new Student("Rostuk" , "Khasanov" , 23 , 5));



    for (Person i : list){
        System.out.println(i.info());
        System.out.println(i.activity());
    }
    }
}
