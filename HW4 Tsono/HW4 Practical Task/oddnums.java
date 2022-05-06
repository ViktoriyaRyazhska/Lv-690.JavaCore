import java.util.Scanner;

public class oddnums {
    public static int count;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter three numbers -i,k,l");
        int i = sc.nextInt();
        int k = sc.nextInt();
        ;
        int l = sc.nextInt();
        amountOddNumber(i);
        amountOddNumber(k);
        amountOddNumber(l);
    }

    public static void amountOddNumber(int s) {
        if (s % 2 != 0) {
            count++;
            System.out.println("Odd number - " + s + "." + "  Amount of odd numbers - " + count);
        }
    }

}
