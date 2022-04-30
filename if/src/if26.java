import java.util.Scanner;

public class if26 {
    public static void main (String[] args) {
    Scanner a = new Scanner(System.in);
    System.out.print("Введите X:");
    float X = a.nextInt();
    int Y;


        if (X<0) {
            Y = 0; System.out.println(+Y);
        }
        else if (X%2 == 0) {
            Y = 1; System.out.println(+Y);
        }
        else if (X%2 != 0)  {
            Y = -1; System.out.println(+Y);
        }


    }

}

