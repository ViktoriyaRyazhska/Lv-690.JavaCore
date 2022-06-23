package HW1;

import java.util.Arrays;
import java.util.stream.Collectors;



public class Task6 {

    public static void execute() {

        // Input text and calculate number of words in this text
        String testString = "The quick brown fox jumps over the lazy dog";
        String[] words = testString.split("\\s+");

        System.out.println("\n*** Task 6 ***");
        System.out.println("Test string:");
        System.out.println(testString);

        System.out.println(String.format("Total wors: %d", words.length));

        int uniqueWords = Arrays.stream(words)
                .map(s -> s.toLowerCase())
                .collect(Collectors.toSet())
                .size();

        System.out.println(String.format("Unique wors: %d", uniqueWords));






    }
}
