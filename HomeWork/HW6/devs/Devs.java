package HW6.devs;

import HW5.Employee;

public class Devs extends Employee{
    private String position;
    public Devs (String name, int age, double salary , String position ){
        super(name , age , salary);
        this.position = position;
    }

       public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String report() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() + " position -" + getPosition() +
                '}';
    }

}