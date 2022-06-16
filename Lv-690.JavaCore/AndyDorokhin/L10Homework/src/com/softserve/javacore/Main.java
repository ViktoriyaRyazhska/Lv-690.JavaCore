package com.softserve.javacore;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Enter in the console sentence of five words.
        //display the longest word in the sentence
        //determine the number of its letters
        //bring the second word in reverse order

        System.out.println("\n*** Task 1 ***");
        String sentence = "There are many string methods";
        System.out.println(sentence);
        String[] words = sentence.split("[\\s\\.]");
        System.out.println(Arrays.toString(words));
        String secondWord = words[1];
        Arrays.sort(words, (s1, s2) -> -(s1.length() - s2.length()));
        //System.out.println(Arrays.toString(words));
        String longestWord = words[0];
        System.out.println("Longest word: " + longestWord);
        System.out.println("Letters in longest word: " + longestWord.length());
        System.out.println("Second word reversed: " + new StringBuilder(secondWord).reverse().toString());

        //Enter a sentence that contains the words between more than one space
        System.out.println("\n*** Task 2 ***");
        sentence = "I    am      learning     Java   Core   at           SoftServe";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s+", " "));

        //Implement a pattern for US currency
        System.out.println("\n*** Task 3 ***");
        sentence = "Regular price: $279.99, your special price: $99.99!!!";
        System.out.println(sentence);

        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            System.out.println(sentence.substring(m.start(), m.end()));
        }
    }
}
