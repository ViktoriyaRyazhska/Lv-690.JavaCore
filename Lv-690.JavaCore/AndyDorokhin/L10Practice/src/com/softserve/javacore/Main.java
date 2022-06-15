package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        // Enter the two variables of type String. Determine whether the first variable substring second
        System.out.println("*** Task1 ***");
        //String s1 = "Soft";
        String s1 = "Soft";
        String s2 = "SoftServe IT Academy";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.contains(s1));

        // Enter surname, name and patronymic on the console
        System.out.println("*** Task2 ***");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your full name, Surname Name Patronymic");
        String fullName = br.readLine();
        String[] nameParts = fullName.split(" ");
        System.out.println(Arrays.toString(nameParts));
        System.out.println("surname and initials: "
                            + nameParts[0]
                            + " "
                            + nameParts[1].substring(0,1).toUpperCase(Locale.ROOT)
                            + nameParts[2].substring(0,1).toUpperCase(Locale.ROOT));
        System.out.println("Name: " + nameParts[1]);
        System.out.println("Name, middle name and last name: " + nameParts[1] + " " + nameParts[2] + " " + nameParts[0]);

        // using regular expressions implement checking the user name for validity
        System.out.println("*** Task3 ***");
        String pattern = "[a-zA-Z0-9_]{3,15}";
        Pattern p = Pattern.compile(pattern);

        String[] userNames = {"AD$", "AndyDo76", "AndyDo_76", "AndyDo-76", "AndyDo 76"};
        for (String username : userNames) {
            System.out.println(username + " : " + isValid(username, p));
        }

    }

    private static boolean isValid(String username, Pattern pattern) {
        return pattern.matcher(username).matches();
    }
}
