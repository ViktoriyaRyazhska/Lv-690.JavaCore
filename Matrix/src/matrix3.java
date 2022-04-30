import java.util.Arrays;
import java.util.Scanner;

public class matrix3 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Введите N:");
        int N = n.nextInt();
        System.out.print("Введите M:");
        int M = n.nextInt();

        int[][] a = new int[N][M];
        int[] b = new int[M];
        int[]c = new int[N];

        if (N > M) {
            for (int j = 0; j < N; j++) {
                System.out.print("Введите" + (j + 1) + "элемент:");
                c[j] = n.nextInt();
            }
        } else {
            for (int j = 0; j < N; j++) {
                System.out.print("Введите" + (j + 1) + "элемент:");
                b[j] = n.nextInt();
            }
        }
        if (M > N) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    a[i][j] = b[i];
                }
                System.out.println(Arrays.toString(a[i]));
            }
        }
        else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    a[i][j] = c[i];
                }
                System.out.println(Arrays.toString(a[i]));
            }

        }
    }
}






