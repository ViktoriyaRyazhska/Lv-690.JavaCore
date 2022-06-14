package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student(new Person.FullName("Andy", "Dorokhin"), 45, 690);
        System.out.println(student1);
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2 = new Student(new Person.FullName("Anna", "Smith"), 25, 692);
        System.out.println(student2);
        System.out.println(student2.info());
        System.out.println(student2.activity());

    }
}
