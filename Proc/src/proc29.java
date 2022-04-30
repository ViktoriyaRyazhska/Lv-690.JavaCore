import java.util.Scanner;

public class proc29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; ++i) {
            System.out.print("Enter a number " + (i + 1) + ":");
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < 5; ++i) {
            while (a[i] > 0) {
                a[i] = a[i] / 10;
                count++;
            }
            System.out.println("Number of digits in " + (i + 1) + " number is: " + count);
            count = 0;
        }
    }

}
