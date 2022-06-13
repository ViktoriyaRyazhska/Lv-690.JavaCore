package com.softserve.javacore;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new SalariedEmployee("Jane Smith", "EMP0011", "1111-22-1784", 4500.0);
        Employee emp2 = new ContractEmployee("Jack Dorsey", "EXT0027", "911-33-2799", 50.0, 30);
        Employee emp3 = new SalariedEmployee("John Taylor", "EMP0012", "1111-22-1935", 2900.0);
        Employee emp4 = new ContractEmployee("Anna Muller", "EXT0034", "911-33-5416", 200.0, 20);

        Employee[] employees = {emp1, emp2, emp3, emp4};
        System.out.println("*** Original order ***");
        for (Employee emp: employees) {
            System.out.println(String.format("Name: %s, employee ID: %s", emp.getName(), emp.getEmployeeld()));
            System.out.println(String.format("average monthly salary: %.2f ", emp.calculatePay()));
        }

        Arrays.sort(employees,
                (e1, e2) -> - Double.compare(e1.calculatePay(),e2.calculatePay()));
        System.out.println("*** Sorted by salary DESCENDING ***");
        for (Employee emp: employees) {
            System.out.println(String.format("Name: %s, employee ID: %s", emp.getName(), emp.getEmployeeld()));
            System.out.println(String.format("average monthly salary: %.2f ", emp.calculatePay()));
        }




    }
}
