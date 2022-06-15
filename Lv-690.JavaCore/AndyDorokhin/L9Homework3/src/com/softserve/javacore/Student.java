package com.softserve.javacore;

import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents (List<Student> students, int course) {
        /*
        receives a list of students and the course number
        and prints to the console the names of the students from the
        list, which are taught in this course (use an iterator)
        */
        System.out.println("Students for course: " + course);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static int compareByName (Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());

    }

    public static int compareByCourse (Student s1, Student s2) {
        return s1.getCourse() - s2.getCourse();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return name != null ? name.equalsIgnoreCase(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.toLowerCase().hashCode() : 0;
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
