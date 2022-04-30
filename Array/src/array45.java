import java.util.Scanner;

public class array45 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        int num1=0;
        int num2 =0;
        int razn = Math.abs(a[0] - a[1]);
        for (int i = 0; i < N - 1; i++) {
            for (int i2 = i + 1; i2 < N; i2++) {
                if (Math.abs(a[i] - a[i2]) < razn) {
                    num1= i + 1;
                    num2 = i2 + 1;
                }
            }
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}
