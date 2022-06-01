package Homework.lesson7.task1;


public class Employee implements Payment{
    private int employeeId;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(String employeeld) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
