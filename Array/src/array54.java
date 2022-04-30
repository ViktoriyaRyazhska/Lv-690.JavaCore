import java.util.Scanner;

public class array54 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int leng = 0;
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент массива А:");
            a[i] = n.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 0) {
                leng = leng + 1;
            }
        }

        int[] b = new int[leng];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < leng; j++) {
                if (a[i] % 2 == 0) {
                    b[j] = a[i];
                }
            }
        }
        System.out.println(leng);
        for (int j = 0; j < leng; j++) {
            System.out.println(b[j]);
        }
    }
}
