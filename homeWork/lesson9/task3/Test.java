package Homework.lesson9.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Ivan",4));
        studentsList.add(new Student("Ostap",2));
        studentsList.add(new Student("Denys",4));
        studentsList.add(new Student("Oleg",1));
        studentsList.add(new Student("Andrii",8));

        Collections.sort(studentsList, new ComparatorName());
        System.out.println(studentsList); // sorted list by name
        Collections.sort(studentsList, new ComparatorCourse());
        System.out.println(studentsList); // sorted list by course
        Student.printStudents(studentsList, 4); // display each student with course 4

    }
}
