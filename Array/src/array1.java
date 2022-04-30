import java.util.Scanner;

    public class array1 {
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.print("Введите целое число N:");
            int N = n.nextInt();
            int[] a = new int[N];

            int i = 0, j = 1;

            for (i= 1; i <= N; i++) {
                a[i] = j;
                j = j + 2;
                System.out.println(a[i]);
            }
        }

    }


