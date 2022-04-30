import java.util.Scanner;

public class array53 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент массива А:");
            a[i] = n.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент массива В:");
            b[i] = n.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] > b[i]) {
                c[i] = a[i];
            } else c[i] = b[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(c[i]);
        }
    }
}

