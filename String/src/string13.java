import java.util.Scanner;

public class string13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку :");
        String str = sc.nextLine();

        long count = str.codePoints().filter(Character::isDigit)
                .count();
        System.out.println(count);
    }

}
