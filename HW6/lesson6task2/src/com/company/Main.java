package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       List<Person> list = new ArrayList<>();

       list.add(new Teacher("Ivan" , 280));
       list.add(new Teacher("Max" , 270));
       list.add(new Cleaner("Nidia" , 267));
       list.add(new Cleaner("Olesia" , 287));
       list.add(new Student("Oleksiy"));
       list.add(new Student("Artem"));

       for(Person i : list){
           i.print();
//           if ((i.getClass() == Teacher.class) || (i.getClass() == Cleaner.class)){
//              System.out.println("My salary is: " + ((Staff) i).salary() + " \u20B4");
//              System.out.println();

            if (i instanceof Staff){
                System.out.println("My salary is: " + ((Staff) i).salary() + " \u20B4");
                System.out.println();
            }
       }


       }


}
