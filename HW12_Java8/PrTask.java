package HW12_Java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class PrTask {
    public static void main(String[] args) {

        System.out.println("-1 random list--");
        Random random = new Random();
        random.ints(1,1000)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-2 sort list--");
        random.ints(1,1000)
                .limit(5)
                .sorted()
                .forEach(System.out::println);

        List<Integer> list = random.ints(1, 1000)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());

        IntSummaryStatistics stats = list.stream().mapToInt(x->x).summaryStatistics();
        System.out.println("max: "+stats.getMax());

        LocalDate now = LocalDate.now();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println("day: "+dayOfWeek);

        LocalDate firstMonday = now.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);

        List<String> names = Arrays.asList("Tom", "Joe", "Elina", "Fred", "Bob");
        names.forEach(System.out::println);
        List<String> sortList = sortList(names);
        sortList.forEach(System.out::println);

    }
    public static List <String> sortList(List <String> list){
        Collections.sort(list,(elem1,elem2) -> elem1.compareTo(elem2));
        return list;
    }
}
