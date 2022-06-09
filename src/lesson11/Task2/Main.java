package lesson11.Task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lesson11.Task2.ReadNumber.readNumber;

public class Main {
    public static void main(String[] args) throws IOException {

        for (int i=0;i<10;i++){
            List<Integer> number = new ArrayList<Integer>();
            number = Collections.singletonList(readNumber(1, 100));
        }
        System.out.println("hello");
    }
}
