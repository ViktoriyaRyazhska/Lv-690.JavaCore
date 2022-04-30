import java.util.Scanner;

public class array44 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int i2 = i+1; i2 < N; i2++) {
                if (a[i] == a[i2]) {
                    System.out.println(i + 1);
                    System.out.println(i2 + 1);
                }
            }
        }

    }
}
