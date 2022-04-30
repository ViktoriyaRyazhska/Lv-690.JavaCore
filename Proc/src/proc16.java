import java.util.Scanner;

public class proc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите A:");
        int A = sc.nextInt();
        System.out.print("Введите B:");
        int B = sc.nextInt();
                           
        int Sum = Integer.signum(A) + Integer.signum(B);
        System.out.println(Sum);
    }
}
