package Homework.lesson7.task1;

public class SalariedEmployee extends Employee implements Payment {
    private int socialSecurityNumber;
    private double salary;
    private String name;

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public SalariedEmployee(int employeeId, String name, double salary, int socialSecurityNumber) {
        super(employeeId);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }


    @Override
    public double calculatePay() {
        return getSalary();
    }
}
