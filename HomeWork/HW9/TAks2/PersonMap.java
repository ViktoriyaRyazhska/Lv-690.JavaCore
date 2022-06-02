package HW9.TAks2;

//Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
//Output the entities of the map on the screen. 
//There are at less two persons with the same firstName among these 10 people?
//Remove from the map person whose firstName is ”Orest” (or other). Print result.  




import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class PersonMap {

    public static void main(String[] args) {
        int count = 0;
        int personMapLength = 0;
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Antony", "Hopkins");
        personMap.put("Victoria", "Backham");
        personMap.put("Ronald", "Kirch");
        personMap.put("Orest", "Menson");
        personMap.put("Mark", "Reus");
        personMap.put("Tom", "Hobbit");
        personMap.put("Orest", "Zaremba");
        personMap.put("Naomi", "Kembel");
        personMap.put("Aston", "Martin");
        personMap.put("Samuel", "Simpson");

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