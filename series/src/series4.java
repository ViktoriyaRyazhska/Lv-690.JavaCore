import java.util.Scanner;

public class series4 {
            public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.print("Введите число N:");
            int N = n.nextInt();
            float[] a = new float[N];
            Scanner in = new Scanner(System.in);

            float Sum = 0, P = 1;
            int i = 0;

            for (float element : a) {
                System.out.print("Введите" + (i + 1) + "й элемент массива");
                a[i] = in.nextInt();

                Sum = Sum + a[i];
                P = P * a[i];
                i++;
            }
            System.out.println(Sum);
            System.out.println(P);
        }
    }

