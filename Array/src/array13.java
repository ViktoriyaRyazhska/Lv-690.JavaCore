import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        System.out.println("Массив элементов с нечетными номерами: ");
        for (int i = N-1; i>=0; i--) {
            if (i % 2 == 0)
                System.out.println(a[i] + "");
        }


    }
}
