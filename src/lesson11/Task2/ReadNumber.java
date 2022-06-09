package lesson11.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {

    public int readNumber(int start, int end) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        try {
            int number = Integer.parseInt(br.readLine());
            if (number > start && number < end) {
                System.out.println(number);
                return number;
            } else {
                throw new Exception();
            }

        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            throw e;
        }

    }
}

