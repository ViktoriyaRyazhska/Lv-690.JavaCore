import java.util.Scanner;

public class while22 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите положительное число N:");
        int N = n.nextInt();
        boolean b = false;

        while (N > 0 & (N%10)%2 ==0)
        {
            N /= 10;
            if((N%10)%2 != 0) {
                b = true;
            }

            System.out.println(b);
        }
    }
}
