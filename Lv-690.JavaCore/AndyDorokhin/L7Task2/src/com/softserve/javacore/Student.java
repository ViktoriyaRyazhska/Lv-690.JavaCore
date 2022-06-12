package com.softserve.javacore;

public class Student extends Person{
    static final String TYPE_PERSON = "Student";
    private String faculty;

    public Student() {}

    public Student(String name, String faculty) {
        super(name);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    void print() {
        System.out.println("My name is " +  getName());
        System.out.println("I am a " +  TYPE_PERSON);
        System.out.println("I study " + getFaculty());
    }

}

