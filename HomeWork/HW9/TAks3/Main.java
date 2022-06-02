package HW9.TAks3;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static List<Student> students = new ArrayList<>();

    public static void printStudent(List<Student> st , int c){
        for (Student i : st){
            if(i.getCourse() == c){
                System.out.println("Student studding on the "+ c + " course is: " + i.getName());
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

        students.add(new Student("Andrew" , 4));
        students.add(new Student("Bruno" , 4));
        students.add(new Student("Antony" , 3));
        students.add(new Student("Arnold" , 3));
        students.add(new Student("Tomas" , 2));
        students.add(new Student("Marry" , 1));

        printStudent(students , 4);
        System.out.println();
        printStudent(students , 3);

        sort();


        for(Student i : students){
            System.out.println(i);
        }
    }
}