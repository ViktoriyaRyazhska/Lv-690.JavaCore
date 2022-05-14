package HW5_OOP1_Inheritance;

public abstract class Employee2 {

    private String name;
    private int age;
    private double salary;

    public Employee2() {
    }

    public String report(){
        return "Name: "+this.getName()+", Age: "+this.getAge()+", Salary: "+this.getSalary()+"";
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
}
