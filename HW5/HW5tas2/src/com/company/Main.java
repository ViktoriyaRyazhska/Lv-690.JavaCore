package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        list.add(new Employee("Ivan" , 21 , 23456.45));
        list.add(new Employee("Artem" , 22 , 25656.48));
        list.add(new Employee("Ivanka" , 19 , 17495.26));
        list.add(new Developer("Max" , 20 , 16945.54 , "C++ developer"));
        list.add(new Developer("Max" , 26 , 13945.59 , "C# developer"));
        list.add(new Developer("Max" , 24 , 11945.27 , "HTML developer"));

        for (Employee i : list){
            System.out.println(i.report());
        }
    }
}
