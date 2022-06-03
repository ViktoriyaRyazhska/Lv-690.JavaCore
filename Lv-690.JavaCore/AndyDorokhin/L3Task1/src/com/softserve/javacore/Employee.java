package com.softserve.javacore;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    private static int totalSum = 0;

    public Employee() {}

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }


    public Employee(String name, int rate, int hours) {
        this(name,rate);
        this.hours = hours;
        totalSum += (rate * hours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public void changeRate (int newRate) {
        int currentSalary = getSalary();
        System.out.println(getName() + " current salary: " + currentSalary);

        setRate(newRate);
        int newSalary = getSalary();
        System.out.println(getName() + " new salary: " + newSalary);

        totalSum = totalSum - currentSalary + newSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
