import java.util.Scanner;

public class while18 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();
        int K = 0;
        int S = 0;

        while (N>0) {
            ++K;
            S +=N%10;
            N = N /10;
        }
        System.out.println(K);
        System.out.println(S);
    }
}
