package lesson13.task1;

/*1. There is a list of strings list1.
 Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Kiev", "Xarkov", "Dnipro", "Lviv", "Odessa", "Kolomiya"));
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.removeIf(x -> (x.length() > 4));
        System.out.println(list2);
    }
}
