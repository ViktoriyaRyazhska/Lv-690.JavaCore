import java.util.Scanner;

public class HW4FloatNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] floatNumbers = new float[3];
        for (int i = 0; i < floatNumbers.length; i++) {
            floatNumbers[i] = scanner.nextFloat();

        }
        for (Float example : floatNumbers) {
            if (example > -5 && example < 5) {
                System.out.println("they all belong to the range [-5,5]");
            } else {
                System.out.println("they not belong to the range [-5,5]");
            }
        }

    }
}
