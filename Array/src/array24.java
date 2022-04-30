import java.util.Scanner;

public class array24 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];
        int R = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }

        R = a[1] - a[0];
        for (int i = 2; i < N; i++) {
            if (R != a[i] - a[i - 1])
                R = 0;
        }
        System.out.println(R);
    }
}
