//Create map personMap and add to it ten persons of type <String, String>
// (lastName, firstName).
//        Output the entities of the map on the screen.
//        There are at less two persons with the same firstName among these 10 people?
//        Remove from the map person whose firstName is ”Orest” (or other). Print result.


package HomeWork_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int count = 0;
        int personMapLength = 0;
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Roma", "Raulsen");
        personMap.put("Vita", "Fantaf");
        personMap.put("Rita", "Kauf");
        personMap.put("Orest", "Brenson");
        personMap.put("Mark", "Tnofl");
        personMap.put("Toni", "Neos");
        personMap.put("Orest", "Manos");
        personMap.put("Liona", "Krauf");
        personMap.put("Martin", "Pattin");
        personMap.put("Sandra", "Neflen");

        System.out.println(personMap);
        for (Map.Entry<String, String> m : personMap.entrySet()) {
            if (personMap.containsKey(m.getKey())) {
                count++;
            }
        }
        if (count == personMapLength) {
            System.out.println("Every name is different");
        } else {
            System.out.println("Name is not different");
        }
        System.out.println("Enter the name, that you want delete ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (personMap.containsKey(name)) {
            System.out.println(" I remove ---name:    " + name);
            personMap.remove(name);
        }
        System.out.println(personMap);
    }
}
