//Print n random numbers on console using Java 8
//        Print n random numbers on console using Java 8 in a sorted order
//        Using Java 8 show the biggest number from n random numbers
//        Show which today is a day of a week
//        Show a date of first Monday for current month
//        Write a method for sorting list of Strings using Java 8


package PracticalTask;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;

public class Practical {
    public static void main(String[] args) {
        //Print n random numbers on console using Java 8
        Random rand = new Random();
        rand.ints(1, 100).limit(3).forEach(System.out::println);
        System.out.println("::::: Print n random numbers on console using Java 8 in a sorted order");
        //        Print n random numbers on console using Java 8 in a sorted order
        rand.ints(10, 50).limit(3).sorted().forEach(System.out::println);

        //        Using Java 8 show the biggest number from n random numbers
        System.out.println("::::: Using Java 8 show the biggest number from n random numbers");
        List<Integer> list = new ArrayList<>();
        list = rand.ints(10, 50).limit(3).boxed().toList();

        System.out.println(list);
        Optional<Integer> max = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("Max number is----" + max);
        System.out.println(list.stream().mapToInt(m -> m).max().getAsInt() + " -----max number");

        //        Show which today is a day of a week

        LocalDateTime nowDayOfWeek = LocalDateTime.now();
        System.out.println(nowDayOfWeek.getDayOfWeek() + "  ---- Show which today is a day of a week");
        //        Show a date of first Monday for current month
//        nowDayOfWeek.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(nowDayOfWeek.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)) + "-----show a date of first Monday for current month");

        //        Write a method for sorting list of Strings using Java 8

        List<String> l = new ArrayList<>();
        l.add("BMW");
        l.add("Acura");
        l.add("Mercedes");
        l.add("Toyota");
        l.add("");
        System.out.println(l);
        listSort(l);

    }

    public static void listSort(List<String> list) {
        List<String> sorted = list.stream().filter(String -> !String.isEmpty()).sorted().collect(Collectors.toList());
        System.out.println(sorted.stream().toList());
    }
}
