import java.util.Scanner;

public class series18 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = n.nextInt();
        Scanner sc = new Scanner(System.in);
        int prev = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int cur = sc.nextInt();
            if (prev = cur)
                System.out.println(cur);
                }
    }
}
