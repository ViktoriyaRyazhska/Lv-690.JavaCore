import java.util.Scanner;

public class array56 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int leng = N / 3;
        int[] a = new int[N];
        int[] b = new int[leng];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент массива А:");
            a[i] = n.nextInt();
        }
        for (int i = 0; i < N; i=i+3) {
             for (int j = 0; j < leng; j++)
                b[j] = a[i];
                }

        System.out.println(leng);
        for (int j = 0; j < leng; j++) {
            System.out.print(b[j]);
        }
            }
}
