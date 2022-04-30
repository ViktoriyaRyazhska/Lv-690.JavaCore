import java.util.Scanner;

public class array18 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Введите" + (i + 1) + "элемент:");
            a[i] = n.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] < a[9]) {
                System.out.println(a[i] + "");
            break;}
            else {
                System.out.println(0);
                break;}
        }
    }
}
