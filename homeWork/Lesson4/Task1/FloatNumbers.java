package Homework.lesson4;

import java.util.Scanner;

public class FloatNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] floatNumbers = new float[3];
        for (int i = 0; i < floatNumbers.length; i++) {
            floatNumbers[i] = scanner.nextFloat();
        }
        for (Float exampl : floatNumbers) {
            if (exampl > 5 || exampl < -5) {
                System.out.println("out of range");
                break;
            }
        }
    }
}
