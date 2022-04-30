import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите целое число N:");
        int N = n.nextInt();

        int c[]=new int[N];
        c[0] =1;
        c[1] =1;
        System.out.println(c[0]);
        System.out.println(c[1]);

        for (int i =2; i <= N; i++) {
            c[i] = c[i-2]+c[i-1];
            System.out.println(c[i]);
        }
    }

}
