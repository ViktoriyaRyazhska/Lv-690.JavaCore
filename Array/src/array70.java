import java.util.Scanner;

public class array70 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }

        for (int i = 0; i < N / 2; i++) {
            int temp = a[i] + a[N / 2 + i];
            a[N / 2 + i] = temp - a[N / 2 + i];
            a[i] = temp - a[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);

        }
        //

    }
}





