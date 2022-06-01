package Homework.lesson9.task3;

import java.util.Comparator;

public class ComparatorCourse implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }
}
