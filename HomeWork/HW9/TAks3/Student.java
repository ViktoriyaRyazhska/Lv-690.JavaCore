package HW9.TAks3;
//Write class Student that provides information about the name of the student and his course. Class Student should consist of
//properties for access to these fields
//constructor with parameters
//method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//methods to compare students by name and by course
//In the main() method 
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name , int course){
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

    @Override
    public String toString() {
        return "Student { " +
                "name = ' " + name + '\'' +
                ", course = " + course +
                '}';
    }

}