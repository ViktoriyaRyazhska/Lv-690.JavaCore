package Practice.MapCollection;

import java.util.*;

public class MapCollection {
    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(23, "John");
        employeeMap.put(45, "Bob");
        employeeMap.put(67, "Sally");
        employeeMap.put(89, "Peter");
        employeeMap.put(90, "Mick");
        Scanner sc = new Scanner(System.in);


        System.out.println(employeeMap);
        System.out.println("Enter user ID");
        int num = sc.nextInt();

        if (employeeMap.containsKey(num)) {
            System.out.println("User found");
            System.out.println(num + "  " + employeeMap.get(num));
        } else {
            System.out.println("Wrong ID");
        }

        System.out.println("Enter user name");
        String name = sc.next();

        if (employeeMap.containsValue(name)) {
            System.out.println("User found");
            for (Map.Entry<Integer, String> en : employeeMap.entrySet()) {
                if (employeeMap.containsValue(name)) {
                    System.out.println(name + "  " + en.getKey());
                    break;
                }
            }

        } else {
            System.out.println("Wrong NAME");
        }

    }
}
