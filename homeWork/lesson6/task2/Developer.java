package Homework.lesson6.task2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return "\nName: " + this.getName() + ", Age: " + this.getAge() + ", Position: " + this.position +
                ", Salary: $" + this.getSalary();
    }
}
