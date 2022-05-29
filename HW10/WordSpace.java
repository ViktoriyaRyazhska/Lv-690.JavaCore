package HW10;

import java.util.Scanner;

public class WordSpace {
    //Enter a sentence that contains the words between more than one space. Convert all spaces, consecutive, one.
// For example, if we introduce the sentence "I    am      learning     Java   Core»,
// we have to get the "I'm learning Java Core»
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = console.nextLine();
        sentence = sentence.replaceAll("[ ]+", " ");
        System.out.print(sentence);
    }
}
