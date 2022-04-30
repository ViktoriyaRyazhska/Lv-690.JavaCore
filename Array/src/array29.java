import java.util.Scanner;

public class array29 {
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

        for (int i = 2; i < N; i += 2) {
            if (a[i] > a[0]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

