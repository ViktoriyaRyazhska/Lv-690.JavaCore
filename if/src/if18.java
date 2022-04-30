import java.util.Scanner;

public class if18 {
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

        if ((A==B) && (A!=C))  {
            System.out.println("Число, отличное от остальных:" +C);
        }
        else if ((B==C) && (B!=A))  {
            System.out.println("Число, отличное от остальных:" +A);
        }
        else if ((A==C) && (A!=B)) {
            System.out.println("Число, отличное от остальных:" +B);
        }

    }

}
