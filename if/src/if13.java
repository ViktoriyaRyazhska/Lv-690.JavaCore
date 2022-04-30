import java.util.Scanner;

public class if13 {

    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите три числа:");
        System.out.print("A:");
        int A = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("B:");
        int B = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.print("C:");
        int C = c.nextInt();

        if ((A>B && B>C) || (C>B && B>A)) {
            System.out.println("Среднее число:" +B);
        }
        else if ((B>A && A>C) || (C>A && A>B))  {
            System.out.println("Среднее число:" +A);
        }
        else if ((A>C && C>B) || (B>C && C>A)) {
            System.out.println("Среднее число:" +C);
        }

    }
}
