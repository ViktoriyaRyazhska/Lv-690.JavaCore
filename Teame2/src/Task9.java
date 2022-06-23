package HW1;

import java.util.Scanner;

public class Task9 {

    public static void execute() {
        int count = 0;

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = (int) Math.ceil(Math.random());
            if (k == 1) {
                count += 1;
            }

        }
        System.out.println(count);
    }

}
