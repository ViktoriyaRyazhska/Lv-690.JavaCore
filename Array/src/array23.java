import java.util.Scanner;

public class array23 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите размер массива N:");
        int N = n.nextInt();
        System.out.print("Введите K:");
        int K = n.nextInt();
        System.out.print("Введите L:");
        int L = n.nextInt();

        int[] a = new int[N];
        int Sum = 0, i = 0, num = 0, Sr = 0;

        for (i = 0; i < N; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
            for (i = 0; i< K-1; i++) {
            Sum = Sum + a[i];
            num = num + 1;}
                   for (i = N - 1; i > L-1; i--) {
            Sum = Sum + a[i];
            num = num + 1;
        }
        System.out.println(Sum);
        System.out.println(num);
        Sr = Sum / num;
        System.out.println(Sr);
    }
}

