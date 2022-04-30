import java.util.Scanner;

public class matrix18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите K:");
        int k = sc.nextInt();

        int[][] a = {
                {2, 3, 4, 5, 8},
                {3, 4, 1, -4, 0},
                {1, 5, 99, 0, 3},
                {-8, 67, 0, 4, 6},
        };
        int Sum = 0;
        int Pr = 1;

        for (int i = 0; i < a.length; i++) {
            Sum += a[i][k-1];
            Pr = Pr * a[i][k-1];
        }
        System.out.println(Sum);
        System.out.println(Pr);
    }
}

