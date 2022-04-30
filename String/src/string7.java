import java.util.Scanner;

public class string7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку :");
        String str = sc.nextLine();
        System.out.println("First symbol: " + str.charAt(0));
        System.out.println("Last symbol: " + str.charAt(str.length() - 1));
    }
}
