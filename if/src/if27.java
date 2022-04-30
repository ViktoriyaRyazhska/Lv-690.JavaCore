import java.util.Scanner;

public class if27 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите X:");
        int X = a.nextInt();
        int Y;


        if (X<=0) {
            Y = -X; System.out.println(+Y);
        }
        else if ((0 < X) && (X < 2)) {
            Y = X*X; System.out.println(+Y);
        }
        else if (X>=2)  {
            Y = 4; System.out.println(+Y);
        }


    }


}
