package Homework.lesson9.task3;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
