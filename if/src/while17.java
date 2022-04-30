import java.util.Scanner;

public class while17 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();
        int K = 0;

        while (N>0) {
            K = N%10;
            System.out.println(+K);
            N = N /10;

        }

    }
}
