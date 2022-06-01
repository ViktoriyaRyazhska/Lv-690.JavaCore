package Homework.lesson7.task1;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee(333, "Oleg", 2500, 7833123);
        employees[1] = new ContractEmployee(022, "Ivan", 105, 10, 25639);
        employees[2] = new SalariedEmployee(322, "Igor", 2750, 1208472);
        employees[3] = new ContractEmployee(044, "Jenya", 250, 40, 49857);
        employees[4] = new SalariedEmployee(311, "Ostap", 3000, 9746836);

        Arrays.sort(employees, new ComparatorSalary());
        System.out.println(Arrays.toString(employees));

    }
}
