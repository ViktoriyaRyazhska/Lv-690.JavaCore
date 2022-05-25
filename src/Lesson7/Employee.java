package Lesson7;

import java.util.Comparator;

public class Employee {
    private  int employeeId;
    private String name;
    double salary;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    public double fixedPaidWorkers = 1000;

    SalariedEmployee(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public void  calculatePay() {
        salary= fixedPaidWorkers;
    }
}

class ContractEmployee extends Employee implements Payment {
    int hourlyPaidWorkers = 160;
    int federalTaxIdmember;
    double hourlyRate = 10;

    ContractEmployee(int employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public void calculatePay() {
        salary=hourlyRate * hourlyPaidWorkers;
    }
}
 class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.salary- o2.salary);
    }
}
