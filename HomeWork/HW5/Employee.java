package HW5;
//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f. ", name , age , salary);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}