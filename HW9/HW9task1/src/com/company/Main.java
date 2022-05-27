package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.invoke.empty.Empty;

import java.util.*;

public class Main {
    ///////////////////////task1////////////////////////////////
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

    ///////////////////////////tsk2////////////////////
    static Map<String, String> personMap = new HashMap<>();


    public static void audit(String firstName) {
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(firstName)) {
                System.out.println("Last name for " + firstName + " is " + entry.getKey());
            } else {
                System.out.println("not found =(");
            }
        }
    }

    public static void audit1() {
        List<String> list = new ArrayList<>();
        List<String> dublicateList = new ArrayList<>();


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            list.add(entry.getValue());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    if (!dublicateList.contains(list.get(j))) {
                        dublicateList.add(list.get(j));
                        System.out.println(list.get(j));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

//////////////tsk1////////////////////////////////
        System.out.println("######################## tsk 1 ################################");
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
//////////////////////////task2/////////////////////
        System.out.println("################### task 2 ###########################");
        personMap.put("Lysiak", "Artem");
        personMap.put("Khasanov", "Rostuk");
        personMap.put("Pasichnik", "Orest");
        personMap.put("Stetcina", "Orest");
        personMap.put("Nedilenko", "Artem");
        personMap.put("Shumov", "Artem");
        personMap.put("Manukian", "Orest");
        personMap.put("Partuka", "Orest");

        System.out.println(personMap + " - person map");

        audit("Orest");
        System.out.println();
        audit1();

    }
}
