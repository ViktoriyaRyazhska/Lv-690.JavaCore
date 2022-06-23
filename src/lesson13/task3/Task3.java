package lesson13.task3;

// Create method to validate date according to format "mm.dd.yy"

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        String dateString = formatter.format(localDate);
        System.out.println(dateString);
    }
}
