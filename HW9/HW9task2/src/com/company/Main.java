package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static List<Student> students = new ArrayList<>();

    public static void printStudent(List<Student> st , int c){
        for (Student i : st){
            if(i.getCourse() == c){
                System.out.println("Name of student which studding on the "+ c + " course is: " + i.getName());
            }
        }
    }

    public static void sort() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getCourse() - o2.getCourse();
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return result;
            }
        });
    }


    public static void main(String[] args) {

        students.add(new Student("Artem" , 4));
        students.add(new Student("Artur" , 4));
        students.add(new Student("Stas" , 3));
        students.add(new Student("Rostuk" , 3));
        students.add(new Student("Roman" , 2));
        students.add(new Student("Katia" , 1));

        printStudent(students , 4);
        System.out.println();
        printStudent(students , 3);

        sort();


        for(Student i : students){
            System.out.println(i);
        }
    }
}
