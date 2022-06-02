package HW9.TAks1;
//Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
//realizing the operations of union and intersection of two sets.
//Test the operation of these techniques on two pre-filled sets. 

import java.util.HashSet;
import java.util.Set;

public class UnionHW9 {

    static Set<Integer> set1 = new HashSet<>();
    static Set<Integer> set2 = new HashSet<>();
    static Set<Integer> set3 = new HashSet<>();
    static Set<Integer> set4 = new HashSet<>();

    public static void union(Set set1, Set set2) {
        set3.addAll(set1);
        set3.addAll(set2);
    }

    public static void intersect(Set set1, Set set2) {
        for (Object i1 : set1) {
            for (Object i2 : set2)
                if (i1 == i2) {
                    set4.add((Integer) i1);
                }
        }
    }
    public static void main(String[] args) {


        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        union(set1, set2);
        System.out.println(set3 + " - all of set1 and set2");

        intersect(set1, set2);
        System.out.println(set4 + " - the same value of set1 and set2");

        System.out.println();

    }
}