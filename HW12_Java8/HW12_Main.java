package HW12_Java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class HW12_Main {
    public static void main(String[] args) {

        //1
        List<String> list1 = Arrays.asList("Gandalf", "Joe", "Eleonora", "Fred", "Bob");
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.removeIf(el -> (el.length() > 5));
        list1.forEach(System.out::println);
        list2.forEach(System.out::println);

        //2
        String sEnc = encrypt("abc", 1);
        System.out.println(sEnc);

        String sDec = decrypt("bcd", 1);
        System.out.println(sDec);

        //3
        validDate("02.29.83","MM.dd.yy");

    }

    public static String encrypt(String s, int n) {

        return s.chars()
                .mapToObj(symb -> String.valueOf((char) (symb + n)))
                .collect(Collectors.joining());

    }

    public static String decrypt(String s, int n) {
        return s.chars()
                .mapToObj(symb -> String.valueOf((char) (symb - n)))
                .collect(Collectors.joining());
    }

    public static String format(Date date, String format) {
        SimpleDateFormat sf = new SimpleDateFormat(format);
        String fdate = sf.format(date);
        return fdate;
    }

    public static void validDate(String value, String format) {

        Date date = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        if (date == null) {
            System.err.println("Invalid date format: "+value);
        } else {
            System.out.println(date);
        }
    }
}
