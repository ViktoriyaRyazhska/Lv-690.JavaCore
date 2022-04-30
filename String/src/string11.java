import java.util.Arrays;
import java.util.Scanner;

public class string11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку :");
        String str = sc.nextLine();

        char[] str1 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str1[i] + " ");
        }
    }
}
