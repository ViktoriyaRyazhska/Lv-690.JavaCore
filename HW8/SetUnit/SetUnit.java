package HomeWork.SetUnit;

import java.util.HashSet;

public class SetUnit {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);

        System.out.println(set1);
        set1.addAll(set2);
        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);

    }
}
