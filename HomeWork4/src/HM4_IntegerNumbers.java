import java.util.Scanner;

public class HM4_IntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerNumbers = new int[3];
        for (int i = 0; i < integerNumbers.length; i++) {
            integerNumbers[i] = scanner.nextInt();
        }
        int max = integerNumbers[0];
        int min = integerNumbers[0];
        for (int ex : integerNumbers) {
            max = Math.max(max, ex);
            min = Math.min(min, ex);

        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}