package Homework.lesson6.task2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20b4 %.2f.", name, age, salary);
    }
}
