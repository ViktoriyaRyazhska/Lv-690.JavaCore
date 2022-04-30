import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.print("Введите целое число N:");
            int N = n.nextInt();
            Scanner a = new Scanner(System.in);
            System.out.print("Введите первый член геометрической прогрессии А:");
            int A = a.nextInt();
            Scanner d = new Scanner(System.in);
            System.out.print("Введите знаменатель геометрической прогрессии D:");
            int D = d.nextInt();
            int[]c = new int[N];

            int j = A;
            int p =1;

            for (int i =0; i <= N; i++) {
                c[i] = A*p;
                p*=D;
                System.out.println(c[i]);
            }
        }

    }
