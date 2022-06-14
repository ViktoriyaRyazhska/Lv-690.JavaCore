package com.softserve.javacore;

public class Student extends Person{
    private final int course;

    public Student(Person.FullName fullname, int age, int course) {
        super(fullname, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return super.info() + String.format("\nI'm enrolled in Lv-%d.JavaCore course", course);
    }

    @Override
    public String activity() {
        return "I study at SoftServe University";
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                "} " + super.toString();
    }
}
