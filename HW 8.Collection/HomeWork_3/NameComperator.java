package HomeWork_3;

import java.util.Comparator;

public class NameComperator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
