import java.util.Scanner;

public class array51 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];
        int[] b = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент массива А:");
            a[i] = n.nextInt();
        }
        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент массива В:");
            b[i] = n.nextInt();
        }
        for (int i = 0; i < N; i++) {
            a[i] = a[i]+b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]);}
        for (int i = 0; i < N; i++) {
            System.out.print(b[i]);
        }
    }
}
