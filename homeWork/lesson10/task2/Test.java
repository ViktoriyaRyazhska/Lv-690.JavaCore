package Homework.lesson10.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        String a = "I    am      learning     Java   Core";
        while (a.contains("  ")) {
            a.replace("  ", " ");

        }
        System.out.println(a);
    }
}
