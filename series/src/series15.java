import java.util.Scanner;

public class series15 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Введите целое число K:");
        int K = n.nextInt();
        Scanner sc = new Scanner(System.in);

        int num = 1, rez = 0, k = 0;

        while (num != 0) {
            num = sc.nextInt();
            k++;
            if (num > K & rez==0)
            rez = k;}
            System.out.println(rez);


    }
    }


