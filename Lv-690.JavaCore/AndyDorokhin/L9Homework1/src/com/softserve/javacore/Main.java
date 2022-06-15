package com.softserve.javacore;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2)
        Set<Integer> set1 = new HashSet<Integer>(List.of(0, 1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(9, 8, 7, 6, 5, 4));
        SetOperations<Integer> setOperations = new SetOperations<>();

        System.out.println(set1);
        System.out.println(set2);
        System.out.println("Union:");
        System.out.println(setOperations.union(set1, set2));
        System.out.println("Intersection:");
        System.out.println(setOperations.intersect(set1, set2));

        // Create map personMap and add to it ten persons of type <String, String> (lastName, firstName)
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Dorokhin", "Andy");
        personMap.put("Hart", "Marty");
        personMap.put("Connor", "Sarah");
        personMap.put("Pain", "Max");
        personMap.put("Wallander", "Kurt");
        personMap.put("Russel", "Kurt");
        personMap.put("Cruise", "Tom");
        personMap.put("Pratt", "Chris");
        personMap.put("Cox", "Cortney");
        personMap.put("Harrelson", "Woody");

        System.out.println(personMap);
        System.out.println("Map size: " + personMap.size());
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Removing entry with first name Kurt");
        personMap.values().remove("Kurt");
        //personMap.values().remove(List.of("Kurt"));
        System.out.println(personMap);
        System.out.println("Map size: " + personMap.size());

    }
}
