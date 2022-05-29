package HW10;

import java.io.PrintStream;
import java.util.*;
import java.util.Scanner;

//Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after
// the dot. Enter the text from the console that contains several occurrences of US currency.
// Display all occurrences on the screen.
public class USCurrency {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the text: ");
              List<String> FormList = new ArrayList<>();

        FormList.add(String.format("$ %.2f", console.nextFloat()));
        FormList.add(String.format("$ %.2f", console.nextFloat()));

        for (String s : FormList) {
            System.out.printf(s.concat(" "));

        }
    }
}
