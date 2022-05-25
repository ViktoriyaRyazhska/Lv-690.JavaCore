package Practice.ListCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ListCollection {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Integer> newIntList = new ArrayList<>();

        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        intList.add(11);
        intList.add(12);
        intList.add(20);
        intList.add(21);

        System.out.println(intList);
        for (Integer i : intList) {

            if (i > 5) {
                newIntList.add(i);
            }
        }
        System.out.println(newIntList);
        for (Integer i : intList) {

            if (i > 20) {
                newIntList.remove(i);
            }
        }
        System.out.println(newIntList);

        intList.set(2, 1);
        intList.set(8, -3);
        intList.set(5, -4);

        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {

            System.out.println("Index :" + i + " Value :" + intList.get(i));
        }

        intList.sort(Comparator.reverseOrder());
        System.out.println(intList);

    }
}
