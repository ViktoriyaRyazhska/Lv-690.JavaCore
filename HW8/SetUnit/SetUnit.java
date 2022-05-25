package HomeWork.SetUnit;

import java.util.HashSet;
import java.util.Set;

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
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);
        set2.add(12);
        set2.add(13);

        System.out.println(union(set1,set2));
        System.out.println(intersect(set1, set2));

    }

    public static Set<Integer> union(HashSet<Integer> s1, HashSet<Integer> s2) {
        HashSet<Integer> union = new HashSet<>();
        for (Integer i1:s1){union.add(i1);}
            for (Integer i2:s2){union.add(i2);}
            return union;


    }
    public static Set<Integer> intersect(HashSet<Integer> s1, HashSet<Integer> s2) {

        Set<Integer> intersect = new HashSet<>();
        for (Integer i1 : s1) {
            for (Integer i2 : s2) {
                if (i1 == i2) {
                    intersect.add(i1);
                }
            }
        }
        return intersect;
    }


}
