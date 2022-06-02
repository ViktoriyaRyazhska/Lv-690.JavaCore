package HomeWork.RangeNum;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RangeNum {
    public static void main(String[] args) throws OutOfRange, IOException {
        boolean restart;

        do {
            restart = false;
            try {
                ReadNumber(50, 100);
            } catch (NumberFormatException e) {
                System.out.println(e);
                System.out.println("Restarting program");
                restart = true;
            }

        } while (restart);

    }

    public static void ReadNumber(int start, int end) throws OutOfRange, IOException {

        int[] arr = new int[10];
        List<Integer> inRange = new ArrayList<>();
        List<Integer> outRange = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number in range of " + start + "-" + end);

        for (int i = 0; i < arr.length; i++) {

            int num = Integer.parseInt(bf.readLine());

            if (start < num && num < end) {
                inRange.add(num);
                System.out.println(num + " In range");
            } else {
                outRange.add(num);
                System.out.println(num + " Out of range");
                try {
                    throw new OutOfRange("Range Exception");
                } catch (OutOfRange e) {
                    System.out.println(e);
                    continue;
                }
            }
        }
        System.out.println("Numbers in range " + inRange);
        System.out.println("Numbers out of range " + outRange);


    }
}
