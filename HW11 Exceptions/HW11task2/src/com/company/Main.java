package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int a;
    static int b;
    static List<Integer> list = new ArrayList<>();

    public static void input() throws NumberFormatException {
        boolean flag = true;
        while (flag) {
            try {

                a = Integer.parseInt(br.readLine());
                flag = false;
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static int readNumber(int start, int end) throws NorRangeException {
        System.out.println("Enter the number");
        input();
        if (start > a || a > end) {
            throw new NorRangeException("Exception: number `" + a + "` is not in the range ["
                    + start + "..." + end + "]");
        }
        return a;
    }

    public static void readTenNumber() throws NorRangeException {

        System.out.println("################ Enter four numbers: ########################");
        System.out.println();

        for (int i = 1; i < 4; i++) {
            boolean flag1 = true;
            while (flag1) {
                try {
                    System.out.println("Enter " + i + " number");
                    input();
                    if (a > 1 && a < 100) {
                        list.add(a);
                        flag1 = false;
                    } else {
                        throw new NorRangeException("number `" + a + "` is not in the range 1...100");
                    }
                } catch (NorRangeException exc) {
                    System.err.println(exc.getMessage());
                }
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) throws IOException, NorRangeException {

        try {
            System.out.println("returned number: " + readNumber(4, 9));
        } catch (NorRangeException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                System.out.println();
                readTenNumber();
            } catch (NorRangeException exception) {
                System.err.println(exception.getMessage());
            }
        }
    }
}
