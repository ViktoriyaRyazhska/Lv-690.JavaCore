import java.util.Scanner;

public class series2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите 10 вещественных чисел:");
        float a1 = n.nextInt();
        float a2 = n.nextInt();
        float a3 = n.nextInt();
        float a4 = n.nextInt();
        float a5 = n.nextInt();
        float a6 = n.nextInt();
        float a7 = n.nextInt();
        float a8 = n.nextInt();
        float a9 = n.nextInt();
        float a10 = n.nextInt();

        float Rez = a1 * a10 * a9*a8*a7*a6*a5*a4*a3*a2;
        System.out.println(Rez);

    }
}
