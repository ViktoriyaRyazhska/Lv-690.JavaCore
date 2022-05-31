package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static boolean myMethod(String name) {
        Pattern p = Pattern.compile("[-a-zA-Z_0-9]{3,15}");
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static void output(){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Enter 5 names of people: ");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < list.size(); i++){
            System.out.println(myMethod(list.get(i)));
        }
    }

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java Core";
        System.out.println(s2.contains(s1));

        String s3 = "Lysiak Artem Volodymyrovych";
        String[] arr = s3.split(" ");
        System.out.println(arr[0] + " " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".");
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(arr));

        output();
    }
}
