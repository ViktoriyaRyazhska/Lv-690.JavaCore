package lesson11.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {

    public static int readNumber(int start, int end) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        try {
            int number = Integer.parseInt(br.readLine());
            if (number > start && number < end) {
                System.out.println(number);
            }
            return number;
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return start;
    }
}

