package com.company;

public class SalariedEmployee extends Employee implements Payment {
    private final double hourlyRate = 64.5d;
    private int numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId , String name , String socialSecurityNumber, int numberOfHoursWorked) {
        super(employeeId , name);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * getNumberOfHoursWorked();
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
