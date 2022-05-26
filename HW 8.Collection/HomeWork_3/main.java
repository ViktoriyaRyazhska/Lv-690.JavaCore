//Write class Student that provides information about
// the name of the student and his course.
// Class Student should consist of
//        properties for access to these fields
//        constructor with parameters
//        method printStudents (List students, Integer course), which receives
//        a list of students
//        and the course number and prints to the console the names of
//        the students from the list,
//        which are taught in this course (use an iterator)
//        methods to compare students by name and by course
//        In the main() method
//        declare List students and add to the list five different students
//        display the list of students ordered by name
//        display the list of students ordered by course.


package HomeWork_3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Roman", 4));
        list.add(new Student("Igor", 2));
        list.add(new Student("Oleg", 1));
        list.add(new Student("Solomia", 2));
        list.add(new Student("Rita", 1));
        Student.printStudents(list, 2);
        list.sort(new NameComperator());
        System.out.println("Відсортовано по імені");
        for (Student s : list) {
            System.out.println("Курс:    " + s.getCourse() + "   Ім'я студента:   " + s.getName());
        }
        list.sort(new courseComperator());
        System.out.println("Відсортовано по курсу");
        for (Student s : list) {
            System.out.println("Відсортовано по курсу" + "Курс:    " + s.getCourse() + "   Ім'я студента:   " + s.getName());
        }
    }
}
