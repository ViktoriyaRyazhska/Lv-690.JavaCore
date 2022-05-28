package HW8_Collections;

import java.util.Comparator;

public class NameComparator implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
