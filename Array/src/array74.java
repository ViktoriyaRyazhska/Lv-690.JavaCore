import java.util.Scanner;

public class array74 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < N; i++) {
            if (a[i] < a[0]) {
                min = a[i];
            }
        }
        for (int i = 1; i < N; i++) {
            if (a[i] > a[0]) {
                max = a[i];
            }
            if (max < min) {
                max += min;
                min = max - min;
                max = max - min;
            }
            for (i = min; i < max; i++) {
                a[i] = 0;
            }

            for (i = 0; i < N; i++) {
                System.out.println(a[i]);

            }
        }
    }
}


