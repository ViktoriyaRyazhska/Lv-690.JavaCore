package Homework.lesson9.task1;

import java.util.Set;
import java.util.TreeSet;

public class Test {


    public static Set union(Set set1, Set set2) {
        set1.addAll(set2);
        return set1;
    }

    public static Set intersect(Set set1, Set set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        Set<Integer> b = new TreeSet<>();
        b.add(30);
        b.add(40);
        b.add(50);
        b.add(60);
        b.add(70);

        Test.union(a, b);
        for (Integer elem : a) {
            System.out.println(elem);
        }
        System.out.println("//////////////////////");
        Test.intersect(a, b);
        for (Integer elem : a) {
            System.out.println(elem);
        }


    }
}
