package Practice.SquaerRec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRec {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int area = 0;

        try {
            int a = Integer.parseInt(n.readLine());
            int b = Integer.parseInt(n.readLine());
            area = squareRectangle(a, b);
        } catch (NegativeNumberException | NumberFormatException e) {
            System.out.println("Input error" + e);
        }

        System.out.println(area);


    }

    public static int squareRectangle(int a, int b) throws NegativeNumberException{

        if (a <= 0 || b <= 0) {
            throw new NegativeNumberException("Negative number");
        }
        return a * b;
    }
}
