import java.util.Scanner;

public class array36 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();
        int out = 0;

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }

        for (int i = 1; i < N-1; i++) {
            if (a[i] > a[i - 1] && a[i + 1] < a[i]) {
                continue;
            } else if (a[i] < a[i + 1] && a[i] < a[i - 1]) {
                continue;
            } else if (a[i] > a[i + 1] ^ a[i]>a[i-1]) {
                out = a[i];
            }
        }
        System.out.println(+out);
    }
}
