import java.util.Scanner;

public class array65 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();
        System.out.print("Введите число К:");
        int K = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int A = a[K-1];
        for (int i = 0; i < N; i++) {
            a[i] = a[i] + A;
            System.out.println(a[i]);
        }


    }
}
