import java.util.Scanner;

public class array40 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число R:");
        int R = n.nextInt();
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int out=1, razn=Math.abs(a[0] - R);
        for (int i = 0; i < N - 1; i++) {
            if ((Math.abs(a[i] - R) < Math.abs(a[i + 1] - R)) && (Math.abs(a[i] - R) < razn)) {
                razn = Math.abs(a[i] - R);
                out = Math.abs(a[i]);
            }
        }
        System.out.println(out);
    }
}
