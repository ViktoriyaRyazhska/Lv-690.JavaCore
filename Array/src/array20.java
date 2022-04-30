import java.util.Scanner;

public class array20 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите K:");
        int K = n.nextInt();
        System.out.print("Введите L:");
        int L = n.nextInt();
        System.out.print("Введите размер массива N:");
        int N = n.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        for (int i = K-1; i < L; i++) {
            System.out.println(a[i] +"");
        }
    }
}
