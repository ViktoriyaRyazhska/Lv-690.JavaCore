package com.softserve.javacore;

import java.util.HashSet;
import java.util.Set;

public class SetOperations<T> {

    public Set<T> union(Set<T> set1, Set<T> set2) {

        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public Set<T> intersect(Set<T> set1, Set<T> set2) {

        Set<T> result = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
