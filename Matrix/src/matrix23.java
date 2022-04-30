import java.util.Arrays;
import java.util.Scanner;

public class matrix23 {
    public static void main(String[] args) {
        int[][] a = {
                {2, 3, 4, 5, 8},
                {3, 4, 1, -4, 0},
                {1, 5, 99, 0, 3},
                {-8, 67, 0, 4, 6},
        };

        for (int i = 0; i < a.length; i++) {
            int min = a[i][0];
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
