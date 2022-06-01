package Homework.lesson10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String a = "$244.123 dog cat $2133 joke boat pig $1 and $012.31 bmw mb audi $05";
        String pattern = "\\$([1-9]+)(\\.[0-9]{2})?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(a);
        while(m.find()) {
            System.out.println(a.substring(m.start(), m.end()));
        }
    }
}
