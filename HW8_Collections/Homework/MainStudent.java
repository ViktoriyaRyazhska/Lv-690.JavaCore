package HW8_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MainStudent {

    public static void main(String[] args) throws Exception {

        ArrayList <Student> students = createStudents();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCourse = insertCourse("insert course:",br);

        Student.printStudents(students,inputCourse);

        students.sort(new NameComparator());
        Student.printAllStudents(students);

        System.out.println("sort asc course---------");
        students.sort(new CourseComparator());
        Student.printAllStudents(students);
        System.out.println("sort desc course---------");
        students.sort(new CourseComparator().reversed());
        Student.printAllStudents(students);
    }

    public static ArrayList <Student> createStudents(){

        ArrayList <Student> list = new ArrayList<>();

        list.add(new Student("Nando",1));
        list.add(new Student("John",2));
        list.add(new Student("Billy",2));
        list.add(new Student("Jay",5));
        list.add(new Student("Joan",4));
        list.add(new Student("George",3));
        list.add(new Student("Al",1));
        list.add(new Student("Kimmi",5));
        list.add(new Student("Frank",4));
        list.add(new Student("Tom",3));

        return list;
    }

    public static int insertCourse(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        int input = Integer.parseInt(br.readLine());
        return input;
    }


}
