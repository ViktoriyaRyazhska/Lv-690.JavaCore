import java.util.Scanner;

public class if28 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите номер года:");
        int X = a.nextInt();



        if (X % 4 ==0) {
            System.out.println("В этом году 366 дней.");
        }
        else {
            System.out.println("В этом году 365 дней.");
        }



    }


}
