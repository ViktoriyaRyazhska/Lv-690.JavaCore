package Homework.lesson10.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void longestWord(String a) {
        String[] splitString = a.split(" ");
        int max = 0;
        int ind = 0;
        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].length() > max) {
                max = splitString[i].length();
                ind = i;
            }

        }
        System.out.println("\nLongest word is: " + splitString[ind] + " It contains " +
                splitString[ind].length() + " letters");
    }

    public static void secondReversed(String a) {
        String[] splitString = a.split(" ");
        StringBuilder sb = new StringBuilder(splitString[1]);
        System.out.println(sb.reverse());
    }

    public static void numOfLetters(String a) {
        Pattern p = Pattern.compile("[a-zA-Z]*");
        Matcher m = p.matcher(a);
        int numOfLet = 0;
        while (m.find()) {
            numOfLet += a.substring(m.start(), m.end()).length();
        }
        System.out.println("\nNumber of letters of all sentence : " + numOfLet);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 words sentence: ");
        String a = scanner.nextLine();
        Test.longestWord(a);
        Test.numOfLetters(a);
        Test.secondReversed(a);
    }
}
