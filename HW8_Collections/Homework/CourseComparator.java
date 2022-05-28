package HW8_Collections;
import java.util.Comparator;

public class CourseComparator implements Comparator <Student> {

@Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse()-o2.getCourse();
    }

@Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
        }
    }
