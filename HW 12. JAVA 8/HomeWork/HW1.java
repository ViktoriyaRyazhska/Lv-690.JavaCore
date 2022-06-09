//1. There is a list of strings list1.
// Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)



        package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Mostyska");
        list1.add("Lviv");
        list1.add("Kyiv");
        list1.add("Dnipro");
        list1.add("London");
        list1.add("Paris");
        list1.add("Varshava");
        list1.add("Mostyska");

        System.out.println(list1);

list1.removeIf(x->x.length()<5);

List<String> list2=list1.stream().distinct().toList();
        System.out.println(list2);

    }
}
