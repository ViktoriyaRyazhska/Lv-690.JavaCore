package homeWork.empoyee3;

public class Employee3 {
    protected String name;
    protected int age;
    protected double salary;

    public Employee3(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report() {
        return "Name :" + getName() +
                ",Age :" + getAge() +
                ",Salary :" + getSalary();
    }
    public void print()
    {
        System.out.println(this.report());
    }
}
