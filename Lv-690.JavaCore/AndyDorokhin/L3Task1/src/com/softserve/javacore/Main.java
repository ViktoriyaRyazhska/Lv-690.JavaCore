package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee ann = new Employee("Anna", 15, 80);
        Employee andy = new Employee("Andy", 20, 150);
        Employee nick = new Employee("Nick", 25, 160);

        System.out.println(ann);
        System.out.println(Employee.getTotalSum());

        ann.changeRate(30);
        System.out.println(ann);
        System.out.println(Employee.getTotalSum());
    }
}
