package Homework.lesson8.task1;

abstract public class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + this.fullName.getFirstName() + ", Last name: " + this.fullName.getLastName() +
                ", Age:" + this.age;
    }
    abstract public String activity();
}
