import java.util.Scanner;

public class series171 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = n.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Введите число B:");
        double B = b.nextInt();
        Scanner sc = new Scanner(System.in);

        int i=0, cur=0;
        while (i<=N) {
            cur = sc.nextInt();
        }
        for (i = 1; i <= N; i++) {
            if (cur >= B)
                System.out.println(B);
            else System.out.println(cur);
        }
    }
}
