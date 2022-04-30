import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];
        int K = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        System.out.println("Массив четных чисел: ");
        for (int i = N - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                K++;
                System.out.print(a[i] + "");
            }
            System.out.println("Количество четных чисел:" + K);
        }
    }
}
