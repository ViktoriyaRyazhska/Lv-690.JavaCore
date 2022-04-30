import java.util.Arrays;
import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.print("Введите N:");
        int N = n.nextInt();
        System.out.print("Введите M:");
        int M = n.nextInt();

        int[][] a = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = i * 10;
            }
            //Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N, у которой все элементы
            // I-й строки имеют значение 10·I (I = 1, . . ., M)

            System.out.println(Arrays.toString(a[i]));
        }
    }
}
