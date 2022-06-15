package com.company;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    static List<String> list = Arrays.asList("aqq","cpppppppppppppppppppp","eeeeee","rrrrrrrr","wwww","tttttttttt",
            "iiiiiiiiiiiiiiii","buuuuuuuuuuuuuu","yyyyyyyyyyyy","doooooooooooooooooo");

    public static int compareByFirstLetter(String s1 , String s2){
        return s1.compareTo(s2);
    }
    public static int compareByLength(String s1 , String s2){
        return s1.length() - s2.length();
    }


    public static void main(String[] args) {
        Random randomInt = new Random();
        List<Integer> listRandomInt = randomInt.ints(-10, 10).limit(10).sorted().boxed().collect(Collectors.toList());
        System.out.println("My list of the random numbers: " + listRandomInt);
        IntSummaryStatistics stats = listRandomInt.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max number: " + stats.getMax());

        DayOfWeek past = LocalDate.now().getDayOfWeek();
        System.out.println(past);

        Month date = LocalDate.now().getMonth();
        System.out.println(date);

        Collections.sort(list, Main::compareByFirstLetter);
        System.out.println("List sorted by first letter:");
        list.forEach(System.out::println);
        System.out.println();
        System.out.println("List sorted by long of the line: ");
        Collections.sort(list, Main::compareByLength);
        list.forEach(System.out::println);
        System.out.println();
        LocalDate dateNow = LocalDate.now();
        LocalDate firstMonday = dateNow.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("Date of first Monday in this month: " + firstMonday);

    }
}
