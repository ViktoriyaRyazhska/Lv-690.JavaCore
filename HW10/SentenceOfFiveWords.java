package HW10;

import java.util.Scanner;

//Enter in the console sentence of five words.
//display the longest word in the sentence
//determine the number of its letters
//bring the second word in reverse order
public class SentenceOfFiveWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the sentence of five words: ");
        String sentence = console.nextLine();
        String[] word = sentence.split(" ");
        int longest = word[0].length();
        String Long = word[0];
        for (String wLong : word) {
            if (wLong.length() > longest) {
                longest = wLong.length();
                Long = wLong;
            }
        }
        System.out.println("The longest word in the sentence is: " + Long);
        System.out.println("The number of its letters are " + longest);
        StringBuilder sb = new StringBuilder();
        sb.append(word[1]);
        System.out.println("The second word in reverse order is: " +sb.reverse());
    }
}
