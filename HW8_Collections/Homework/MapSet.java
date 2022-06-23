package HW8_Collections;

import java.util.*;

public class MapSet {

    public static void main(String[] args) {

        //1 Sets
        Set <String> set1 = createSet1();
        Set <String> set2 = createSet2();

        union(set1,set2);
        System.out.println(set1);
        System.out.println();

        intersect(set1,set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println();

        //2 personMap
        HashMap<String,String> personMap = createMap();
        printMap(personMap);
        compareFN(personMap);

        removePerson(personMap,"Al");
        printMap(personMap);
    }
    public static Set <String> createSet1(){
        Set <String> set1 = new HashSet<>();
        set1.add("Jack");
        set1.add("John");
        set1.add("Jimmy");
        set1.add("Jay");
        set1.add("Al");

        return set1;
    }

    public static Set <String> createSet2(){
        Set <String> set2 = new TreeSet<>();
        set2.add("Jin");
        set2.add("Joan");
        set2.add("Jimmy");
        set2.add("Nando");
        set2.add("Al");

        return set2;
    }

    public static void union(Set <String> set1, Set <String> set2){
        set1.addAll(set2);
    }

    public static void intersect(Set <String> set1, Set <String> set2){
        set1.retainAll(set2);
    }
    public static HashMap<String,String> createMap(){
        HashMap <String,String> personMap = new HashMap<>();
        personMap.put("Russell","Jack");
        personMap.put("Depp","John");
        personMap.put("Keys","Jimmy");
        personMap.put("Ocon","Jay");
        personMap.put("Rolling","Joan");
        personMap.put("Fred","Jin");
        personMap.put("Nicholson","Al");
        personMap.put("Raikonen","Kimmi");
        personMap.put("Alonso","Nando");
        personMap.put("Pacino","Al");

        return personMap;
    }
    public static void printMap(HashMap <String,String> map) {
        for (HashMap.Entry<String, String> entry:map.entrySet())
            System.out.println("last name: " + entry.getKey() + ", first name: " + entry.getValue());
    }
    public static void compareFN(HashMap <String,String> map){

        TreeSet <String> uniqueNames = new TreeSet<>();

        for (String name :map.values())
        {
            uniqueNames.add(name);
        }

        if (map.size() != uniqueNames.size()){
            System.err.println("You have the same names in the list");
        }
    }
    public static void removePerson(HashMap <String,String> map,String name) {

        List <String> forRemove = new ArrayList<>();
        for (HashMap.Entry<String, String> entry:map.entrySet())
            if (entry.getValue().equals(name)){
                forRemove.add(entry.getKey());
            }

        System.out.println(forRemove);

        for (String elem: forRemove) {
            map.remove(elem);
        }
    }

}
