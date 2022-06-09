package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        // Create five objects of class Employee
        Employee emp1 = new Employee("Anna", 1, 2500);
        Employee emp2 = new Employee("Max", 1, 1500);
        Employee emp3 = new Employee("Sara", 2, 3500);
        Employee emp4 = new Employee("Tim", 2, 2500);
        Employee emp5 = new Employee("Alex", 3, 500);

        //Display all employees of a certain department (enter department number in the console)
        System.out.println("Please enter department number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int depNum = Integer.parseInt(br.readLine());
            listDepartment(depNum, emp1, emp2, emp3, emp4, emp5);
        }
        catch (NumberFormatException ex) {
            System.out.println("Please provide POSITIVE INTEGER department number");
            System.out.println(ex.getMessage());

        }

        // arrange workers by the field salary in descending order.
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        System.out.println("Original order: ");
        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees, (e1, e2) -> -(e1.getSalary() - e2.getSalary()));
        System.out.println("Sorted by salary (descending): ");
        System.out.println(Arrays.toString(employees));

    }

    private static void listDepartment(int depNum, Employee... employees) {
        int count = 0;
        for (Employee emp : employees) {
            if (emp.getDepartmentNum() == depNum) {
                System.out.println(emp);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No such department: " + depNum);
        }
    }
}
