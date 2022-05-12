package com.company;

public class Employee {
    String name;
    int dn;
    int salary;

    public Employee(String name, int dn, int salary) {
        this.name = name;
        this.dn = dn;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDn() {
        return dn;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDn(int dn) {
        this.dn = dn;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
