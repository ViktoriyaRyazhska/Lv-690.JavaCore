import java.util.Scanner;

public class string9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четное число N:");
        int N = sc.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Введите символ С1:");
        String С1 = c.nextLine();
        Scanner cc = new Scanner(System.in);
        System.out.println("Введите символ С2:");
        String С2 = cc.nextLine();

        StringBuilder sb = new StringBuilder("string: ");
        for (int i = 1; i <= N/2; i++) {
            sb.append(С1).append(С2);
        }

        String str = sb.toString();
        System.out.println(str);
    }
}
