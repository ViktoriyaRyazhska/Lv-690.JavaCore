//In the main() method declare map employeeMap of pairs <Integer, String>.
//        Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
//        Ask user to enter ID, then find and write corresponding name from your map.
//        If you can't find this ID - say about it to user (use function containsKey()).
//        Ask user to enter name, verify than you have name in your map and write corresponding ID.
//        If you can't find this name - say about it to user (use function containsValue()).
//
package PracticalTask_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Roman");
        employeeMap.put(10, "Igor");
        employeeMap.put(20, "Ivan");
        employeeMap.put(30, "Solomia");
        employeeMap.put(40, "Mark");
        employeeMap.put(50, "Mark");
        employeeMap.put(60, "Mark");
        System.out.println(employeeMap);

        System.out.println("Please, enter ID::::");
        int idInput = sc.nextInt();

        if (employeeMap.containsKey(idInput)) {
            System.out.println("Well done, find " + employeeMap.get(idInput));

        } else {
            System.out.println("Please, try again. You write wrong id.");
        }

        System.out.println("Please, enter Name::::");
        String name = sc.next();
        if (employeeMap.containsValue(name)) {
            System.out.println("Every thing is OK. You find user.  ");
            for (Map.Entry<Integer, String> maps : employeeMap.entrySet()) {
                if (name.equals(maps.getValue())) {
                    System.out.println(name + maps.getKey());

                }

            }

        } else {
            System.out.println("Can not find name");
        }
    }
}
