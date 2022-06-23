package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static int inputTask10() {
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number > 1:");
        boolean flag = true;
        while (flag) {
            try {
                number = Integer.parseInt(br.readLine());
                if (number < 1) {
                    throw new RuntimeException("Incorrect number, try again");
                } else {
                    flag = false;
                    return number;
                }
            } catch (NumberFormatException | IOException e) {
                System.err.println("Incorrect value. Try again");
            }
        }
        return 0;
    }
    public static void executeTask10() {
        int steps = 0;
        int number1 = inputTask10();

        while (number1 != 1) {
            if (number1 % 2 == 0) {
                number1 = number1 / 2;
                steps++;
            } else {
                number1 = number1 * 3 + 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
