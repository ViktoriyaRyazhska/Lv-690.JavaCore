package com.company;

import java.security.Key;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, String> employeeMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        employeeMap.put(1, "Artem");
        employeeMap.put(2, "Artur");
        employeeMap.put(3, "Max");
        employeeMap.put(4, "Nastia");
        employeeMap.put(5, "Yulia");
        employeeMap.put(6, "Artem");
        employeeMap.put(7, "Artem");

        System.out.println(employeeMap);

        System.out.println("Enter ID :");
        int id = sc.nextInt();


        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("not found =(");
        }

        System.out.println();

        System.out.println("Enter name :");
        String name = sc1.nextLine();

        if (employeeMap.containsValue(name)){
            for(Map.Entry i : employeeMap.entrySet()){
                if( i.getValue().equals(name)){
                    System.out.println(i.getKey());
                }
                else
                {
                    System.out.println("not found(");
                }
            }
        }
        else {
            System.out.println("error");
        }

    }
}


