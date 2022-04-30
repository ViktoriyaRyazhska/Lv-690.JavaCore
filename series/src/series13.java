import java.util.Scanner;

public class series13 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            int num = 1, k = 0, sum =0;

            while (num !=0) {
                num = sc.nextInt();
                k++;
                if (num %2 == 0) sum = sum + num;
               }
            System.out.println(sum);

        }
}
