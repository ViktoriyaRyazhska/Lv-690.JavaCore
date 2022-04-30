import java.util.Scanner;

public class array38 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int num=0;

        for (int i = 0; i < N-1; i++) {
            if (a[i] > a[i + 1]) {
                continue;
            } else if (a[i] < a[i + 1]) {
                num = num + 1;
            }
        }
        System.out.println(num);
    }
}
