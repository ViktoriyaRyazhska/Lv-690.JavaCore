package Lesson6.Task2;

public class Developer extends Employee {
    String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age %d, position: %s, salary: \u20B4, %.2f", name, age, position, salary);

    }
}
