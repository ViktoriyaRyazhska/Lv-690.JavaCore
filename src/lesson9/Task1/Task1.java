package lesson9.Task1;


import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet();
        set3.addAll(set1);
        set3.addAll(set2);

        for (Integer set : set3) {
            System.out.println(set);
        }
    }

    public void intersect(Set set1, Set set2) {
        set1.retainAll(set2);

        for (Object set : set1) {
            System.out.println(set);
        }

    }
}











