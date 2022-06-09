package JavaCore.HomeWork;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {


        //Practice
        Random ran1 = new Random();

        System.out.println("Practice");
        ran1.ints(1, 90).limit(5).forEach(System.out::println);
        System.out.println("----------");
        ran1.ints(1, 89).limit(5).sorted().forEach(System.out::println);
        System.out.println("----------");

        List<Integer> inter = Arrays.asList(9, 5, 6, 7, 8, 9);
        IntSummaryStatistics stat = inter.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stat.getMin());

        System.out.println("----------");

        LocalDate dt = LocalDate.now();
        System.out.println(dt);
        LocalDate dt2 = dt.plus(1, ChronoUnit.WEEKS);
        System.out.println(dt2);

        System.out.println("----------");

        List<String> name = Arrays.asList("Jim", "Seth", "Kim", "Lars");

        Collections.sort(name, (p1, p2) -> p1.compareTo(p2));

        System.out.println(name);

        //HomeWork
        System.out.println("HomeWork");

        List<String> list1 = new ArrayList<>();
        list1.add("Seth");
        list1.add("Jim");
        list1.add("Kim");
        list1.add("Zord");
        list1.add("Jackson");
        System.out.println(list1);

        list1.removeIf(n -> n.length() >= 5);
        List<String> list2 = list1;
        System.out.println(list2);

        System.out.println("----------");

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String format = formatter.format(date);
        boolean checkFormat;

        if (format.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
            checkFormat = true;
        else
            checkFormat = false;

        System.out.println(format + " " + checkFormat);

        System.out.println("----------");

        String txt = "Abracadabra";
        int limit = 3;

        Decoded dec = (a, b) -> (a.substring(b, b + limit));
        Decoded enc = (a, b) -> (a.substring(0, b));


        System.out.println(txt);
        System.out.println(txt + " Decoded " + dec.dec(txt, 4));
        System.out.println(txt + " Encoded " + enc.dec(txt, txt.length()));


    }

}

