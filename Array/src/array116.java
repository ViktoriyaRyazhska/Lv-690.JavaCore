import java.util.Scanner;

public class array116 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int K=10;
        int[] b = new int[K];
        int[] c = new int[N];


        for (int i = 0; i < N; i++) {
            if (a[i] == a[i + 1]) {
                ++b[K];
            } else {
                ++K;
                b[K] = 1;
                c[K] = a[i];
            }
            for (i = 0; i <= K; i++) {
                System.out.println(b[i]);
                System.out.println(c[i]);
            }
        }
    }
}
