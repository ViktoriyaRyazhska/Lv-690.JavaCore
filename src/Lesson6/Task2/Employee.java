package Lesson6.Task2;

class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age %d, salary: \u20B4, %.2f", name,age,salary );
    }
    public void show(){
        System.out.println(report());
    }
}
