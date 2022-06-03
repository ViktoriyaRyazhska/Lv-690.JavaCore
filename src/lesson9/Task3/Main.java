package lesson9.Task3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 1);
        Student student2 = new Student("Katya", 5);
        Student student3 = new Student("Lena", 4);
        Student student4 = new Student("Olya", 2);
        Student student5 = new Student("Serega", 3);

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        student1.printStudents(list, 2);
        System.out.println(" ");
        student1.compareByCourse(list);
        System.out.println(" ");
        student1.compareByName(list);
    }
}