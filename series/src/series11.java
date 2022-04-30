import java.util.Scanner;

public class series11 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Введите число K:");
        int K = k.nextInt();
        Scanner n = new Scanner(System.in);
        System.out.print("Введите число N:");
        int N = n.nextInt();
        int[] a = new int[N];
        Scanner in = new Scanner(System.in);

        int i = 0;

        for (int element : a) {
            System.out.print("Введите" + (i + 1) + "й элемент массива");
            a[i] = in.nextInt();

            if (a[i] < K) System.out.println("True");
            else System.out.println("False");
            i++;
        }


    }

}
