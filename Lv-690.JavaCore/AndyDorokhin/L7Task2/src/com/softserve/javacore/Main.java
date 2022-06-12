package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Teacher("Anna");
        Person person2 = new Cleaner("Max");
        Person person3 = new Student("Tim", "Math");

        Person[] persons = {person1, person2, person3};
        for (Person p : persons) {
            System.out.println(p);
            p.print();
            if (p instanceof Staff) {
                ((Staff) p).salary();
            }
        }
    }
}
