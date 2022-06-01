package Homework.lesson9.task3;

import java.util.List;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student (String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "\nStudent " +
                "name " + name +
                ", course " + course +
                '}';
    }

    public static void printStudents(List<Student> students, Integer course){
        for(Student elem : students) {
            if (elem.course == course) {
                System.out.println("\nStudent name: " + elem.getName() + ", his course is:" + elem.getCourse());
            }
        }

    }
}
