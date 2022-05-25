package com.company;

public class Student extends Person {
    private int course;

    public Student(String firstName , String lastNAme , int age, int course){
        super(firstName, lastNAme, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + "course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}

