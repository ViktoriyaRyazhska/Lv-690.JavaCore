package lesson9.Task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Person {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Ivanov", "Orest");
        personMap.put("Set", "Pavel");
        personMap.put("Tad", "Orest");
        personMap.put("Sad", "Kolya");
        personMap.put("KLL", "Vova");
        personMap.put("Maf", "Olya");
        personMap.put("Try", "Ira");
        personMap.put("Ikra", "Den");
        personMap.put("Aru", "Nata");
        personMap.put("Pry", "Yana");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(" ");

        Iterator iter = personMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            if (entry.getValue() == "Orest") {
                iter.remove();
            }

        }

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(" ");

    }

}
