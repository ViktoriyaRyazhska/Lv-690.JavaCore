import java.util.Arrays;
import java.util.Scanner;

public class array102 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();
        System.out.print("Введите число К:");
        int K = n.nextInt();

        int[] a = new int[N + 1];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int mem = a[K];
        a[K] = 0;
        for (int i = K + 1; i < N + 1; i++) {
            int temp = mem;
            mem = a[i];
            a[i] = temp;
        }
        //for (int i = 0; i < N+1; i++)
        System.out.println(Arrays.toString(a));
    }

}


