package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        //declare map employeeMap of pairs <Integer, String>
        Map<Integer, String> employeeMap = new HashMap<>();
        System.out.println(employeeMap);
        employeeMap.put(1001, "Employee 1");
        employeeMap.put(1002, "Employee 2");
        employeeMap.put(1003, "Employee 3");
        employeeMap.put(1004, "Employee 4");
        employeeMap.put(1005, "Employee 5");
        employeeMap.put(1006, "Employee 6");
        employeeMap.put(1007, "Employee 7");
        System.out.println(employeeMap);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Ask user to enter ID, then find and write corresponding name from your map
        System.out.println("Please enter employee ID, 1001 to 1007");

        try {
            int employeeID = Integer.parseInt(br.readLine());
            if (employeeMap.containsKey(employeeID)) {
                System.out.println(employeeMap.get(employeeID));
            }
            else {
                System.out.println("ID not found: " + employeeID);
            }

        }
        catch (NumberFormatException ex) {
            System.out.println("Please eneter VALID INTEGER number, 1001 to 1007");
            System.out.println(ex.getClass().getSimpleName() + " : " + ex.getMessage());
        }

        //Ask user to enter name, verify than you have name in your map and write corresponding ID
        System.out.println("Please enter employee name");
        String employeeName = br.readLine();
        if (employeeMap.containsValue(employeeName)) {
            for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(employeeName)) {
                    System.out.println(entry.getKey());
                }
            }
        }
        else {
            System.out.println("Name not found: " + employeeName);
        }



    }
}
