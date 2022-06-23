package com.softserve.javacore;

import java.util.Set;

public class Task4 {

    public static void execute() {

        // Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)

        String testString = "My test string";
        Set<Character> loudLetters = Set.of('a', 'e', 'i', 'o', 'u', 'y');
        int counter = 0;

        System.out.println("\n*** Task 4 ***");
        System.out.println("Test string:");
        System.out.println(testString);
        for (int i = 0; i < testString.length(); i++) {
            if (loudLetters.contains(testString.toLowerCase().charAt(i))) {
                counter ++;
            }

        }

        System.out.println(String.format("Total vowels: %d", counter));


    }
}
