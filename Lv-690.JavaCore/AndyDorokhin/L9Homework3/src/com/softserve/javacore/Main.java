package com.softserve.javacore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Student BB", 690),
                new Student("student aa", 692),
                new Student("Student CC", 690),
                new Student("Student AA", 692),
                new Student("Student DD", 690)
        ));

        System.out.println(students);

        Student.printStudents(students, 690);

        System.out.println("Sorted by name:");
        Collections.sort(students, Student::compareByName);
        System.out.println(students);

        System.out.println("Sorted by course:");
        Collections.sort(students, Student::compareByCourse);
        System.out.println(students);

    }
}
