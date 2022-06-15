package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static boolean dateIsValid(String date) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }


    

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Artem", "Ivan", "Kolia", "Max", "Yevgen", "Rostuk", "Stas"));
        List<String> list2 = new ArrayList<>();
        System.out.println("Start list1: " + list1);
        list2.addAll(list1);
        list2.removeIf(x -> (x.length() > 4));
        System.out.println("List 2: " + list2);

        String s1 = "29.02.24";

        System.out.println(dateIsValid(s1));

    }
}
