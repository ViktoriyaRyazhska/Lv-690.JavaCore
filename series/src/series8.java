import java.util.Scanner;

public class series8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = n.nextInt();
        int[] a = new int[N];
        Scanner in = new Scanner(System.in);

        int K = 0;
        int i = 0;

        for (int element : a) {
            System.out.print("Введите" + (i + 1) + "й элемент массива");
            a[i] = in.nextInt();

                if (a[i] % 2 == 0) {
                    K = K + 1;
                    System.out.println(a[i]);               }
            i++;

        }
            System.out.println(K);

        }

}
