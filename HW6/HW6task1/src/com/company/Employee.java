package com.company;

public abstract class Employee implements Payment {
    private String employeeId;
    private String name;

    public Employee(String employeeId , String name) {
        this.employeeId = employeeId;
        this.name = name;
    }


    public final void getInformation(){
        System.out.print("ID: " + employeeId + ", name: " + name);
    }


}
