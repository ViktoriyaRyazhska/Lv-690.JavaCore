package com.softserve.javacore;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Anna Smith", 35, 2500);
        Employee emp2 = new Developer("Connor Macleod", 65, 5000, "Senior Java developer");
        System.out.println(emp1.report());
        System.out.println(emp2.report());

    }
}
