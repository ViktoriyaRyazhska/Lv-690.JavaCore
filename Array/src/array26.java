import java.util.Scanner;

public class array26 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите длину массива N:");
        int N = n.nextInt();

        int[] a = new int[N];
        int PNum = 0;
        int Delti = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }

        for (int i = 1; i < N - 1; i++) {
            Delti = (a[i] % 2 + a[i - 1] % 2);
            if (Delti != 1) {
                PNum = i;
                break;
            }
        }
        if (PNum > 0)
            System.out.println(PNum);
        else
            System.out.println(0);
    }
}

