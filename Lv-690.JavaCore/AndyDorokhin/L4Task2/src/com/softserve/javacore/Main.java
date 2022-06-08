package com.softserve.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Please enter weekday number, 1 to 7");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String weekdayNumber = br.readLine();
        switch (weekdayNumber) {
                case "1":
                    System.out.println("Понеділок / Monday / Montag");
                    break;
                case "2":
                    System.out.println("Вівторок / Tuesday / Dienstag");
                    break;
                case "3":
                    System.out.println("Середа / Wednesday / Mittwoch");
                    break;
                case "4":
                    System.out.println("Четвер / Tuesday / Donnerstag");
                    break;
                case "5":
                    System.out.println("Пятниця / Friday / Freitag");
                    break;
                case "6":
                    System.out.println("Субота / Saturday / Samstag");
                    break;
                case "7":
                    System.out.println("Неділя / Sunday / Sonntag");
                    break;
                default:
                    System.out.println("Valid numbers 1 to 7, bye!");


        }


    }
}
