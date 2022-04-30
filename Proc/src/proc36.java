import java.util.Scanner;

public class proc36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonachi(n));
    }

    private static int fibonachi(int n) {
// умови виходу з рекурсії
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
// рекурсивні виклики
            return fibonachi(n - 2) + fibonachi(n - 1);
        }
    }
}
