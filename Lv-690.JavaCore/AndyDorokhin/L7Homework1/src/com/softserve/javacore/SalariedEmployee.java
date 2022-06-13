package com.softserve.javacore;

public class SalariedEmployee extends Employee{
    private String socialSecurityNumber;
    private double fixedSalary;

    public SalariedEmployee() {}

    public SalariedEmployee(String name, String employeeld, String socialSecurityNumber, double fixedSalary) {
        super(name, employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedSalary = fixedSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SalariedEmployee that = (SalariedEmployee) o;

        if (Double.compare(that.fixedSalary, fixedSalary) != 0) return false;
        return socialSecurityNumber != null ? socialSecurityNumber.equals(that.socialSecurityNumber) : that.socialSecurityNumber == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (socialSecurityNumber != null ? socialSecurityNumber.hashCode() : 0);
        temp = Double.doubleToLongBits(fixedSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixedSalary=" + fixedSalary +
                "} " + super.toString();
    }

    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}
