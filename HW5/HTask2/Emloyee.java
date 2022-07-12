package HW5.HTask2;

public class Emloyee {
    private String name;
    private int age;
    private double salary;

    public Emloyee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name, age, salary);
    }

    public void print() {
        System.out.println(this.report());
    }
}
