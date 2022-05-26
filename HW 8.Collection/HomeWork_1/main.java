//Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
//        realizing the operations of union and intersection of two sets.
//        Test the operation of these techniques on two pre-filled sets.

package HomeWork_1;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(60);
        set1.add(70);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(50);
        set2.add(60);
        set2.add(70);
        set2.add(80);
        set2.add(90);

        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));

    }

    public static Set<Integer> union(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> union = new HashSet<>();
        for (Integer nums1 : set1) {
            union.add(nums1);
        }
        for (Integer nums2 : set2) {
            union.add(nums2);
        }
        return union;
    }

    public static Set<Integer> intersect(HashSet<Integer> set1, HashSet<Integer> set2) {
        Set<Integer> intersect = new HashSet<>();
        for (Integer i : set1) {
            for (Integer j : set2) {
                if (i == j) {
                    intersect.add(i);
                }
            }
        }
        return intersect;
    }

}
