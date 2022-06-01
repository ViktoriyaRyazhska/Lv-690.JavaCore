package Homework.lesson9.task2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Andriy", "Andtysukiv");
        personMap.put("Borus", "Jonsonuk");
        personMap.put("Cyber", "Bot");
        personMap.put("Den", "Bratukh");
        personMap.put("Evgen", "Bratukh");
        personMap.put("Fransya", "Jylien");
        personMap.put("John", "Sena");
        personMap.put("Kate", "Mid");
        personMap.put("Lester", "Kop");
        personMap.put("Maria", "Karapeta");

        Set<String> lastNamesSet = new HashSet<>();
        for(String elem : personMap.values()) {
            lastNamesSet.add(elem);
        }
        if(personMap.size() != lastNamesSet.size()) {
            System.out.println("You have duplicated values(last names) in your map");
        } else {
            System.out.println("No duplicated found");
        }

        personMap.remove("Cyber");
        System.out.println(personMap);
    }
}
