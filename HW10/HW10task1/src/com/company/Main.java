package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        System.out.println("Enter five words: ");
        Pattern p = Pattern.compile("[a-zA-Z]{2,15}");


        for (int i = 0; i < 5; i++) {
            boolean flag = true;
            while (flag) {
                String str = sc.nextLine();
                Matcher m = p.matcher(str);

                if (m.matches() == true) {
                    arr[i] = str;
                    flag = false;
                } else {
                    System.out.println("incorrect word");
                }
            }
        }

        String maxLength = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > maxLength.length()) {
                maxLength = arr[i];
            }
        }
        System.out.println("the longest word in the sentence: " + maxLength + ", the number of its letters: " + maxLength.length());

        System.out.println("the second word in reverse order:  " + new StringBuilder(arr[1]).reverse());
    }

}
