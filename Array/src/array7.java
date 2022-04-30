import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i+1) +"элемент:");
            a[i] =n.nextInt();
        }
        System.out.print("Обратный массив: ");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}

