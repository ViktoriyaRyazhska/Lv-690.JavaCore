package com.softserve.javacore;

public abstract class Employee implements Payment{
    private String name;
    private String employeeld;

    public Employee() {}

    public Employee(String name, String employeeld) {
        this.name = name;
        this.employeeld = employeeld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return employeeld != null ? employeeld.equals(employee.employeeld) : employee.employeeld == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (employeeld != null ? employeeld.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeld='" + employeeld + '\'' +
                '}';
    }

}
