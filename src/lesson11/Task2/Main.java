package lesson11.Task2;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class Main {
    public static void main(String[] args)  {
        ReadNumber readNumber = new ReadNumber();
        List<Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            try {
                number.add(readNumber.readNumber(1, 100));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("____________");
        for (Integer item : number) {
            System.out.println(item);
        }
    }
}
