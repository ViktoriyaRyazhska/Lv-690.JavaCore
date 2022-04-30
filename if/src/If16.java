import java.util.Scanner;

public class If16 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите три переменных:");
        System.out.print("A:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("B:");
        int B = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.print("C:");
        int C = c.nextInt();

        if (A<B && B<C) {
            int A1 = 2*A;
            int B1 = 2*B;
            int C1 = 2*C;
            System.out.println(+A1);
            System.out.println(+B1);
            System.out.println(+C1);
        }
        else {
            int A1 = -A;
            int B1 = -B;
            int C1 = -C;
            System.out.println(+A1);
            System.out.println(+B1);
            System.out.println(+C1);}


        }

    }

