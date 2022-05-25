package Lesson7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new SalariedEmployee(45, "Ivan");
        Employee emp2 = new SalariedEmployee(30, "Vova");
        Employee emp3 = new ContractEmployee(20, "Petr");
        Employee emp4 = new ContractEmployee(15, "Taras");

        List<Employee> list = new ArrayList<Employee>();

        list.add(emp3);
        list.add(emp2);
        list.add(emp1);
        list.add(emp4);
        for (Employee emp : list) {
            ((Payment) emp).calculatePay();
            System.out.println("Name: " + emp.getName() + " Id: " + emp.getEmployeeId() + " Salary: " + emp.salary);
        }
        list.sort(new SalaryComparator());
        for (Employee emp : list) {
            System.out.println("Name: " + emp.getName() + " Id: " + emp.getEmployeeId() + " Salary: " + emp.salary);
        }
    }


}

