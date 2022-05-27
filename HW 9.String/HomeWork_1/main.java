//Enter in the console sentence of five words.
//        display the longest word in the sentence
//        determine the number of its letters
//        bring the second word in reverse order
//


package HomeWork_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in the console sentence of five words");
        String input = sc.nextLine();
        System.out.println(input + " You enter this phrase");
        String mass[] = input.split(" ");
        int longest = mass[0].length();
        String Long = mass[0];
        for (String wLong : mass) {
            if (wLong.length() > longest) {
                longest = wLong.length();
                Long = wLong;

            }
        }
        System.out.println(Long + "-----the longest word      " + longest + " --- the numbers of letters");
        StringBuilder sb = new StringBuilder();
        sb.append(mass[1]);
        System.out.println(sb.reverse());
    }
}
