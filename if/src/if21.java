import java.util.Scanner;

public class if21 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите координаты точки на плоскости:");
        System.out.print("X:");
        int X = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Y:");
        int Y = b.nextInt();

        if ((X==0) && (Y==0))  {
            System.out.println(0);
        }
        else if ((X==0) && (Y!=0))  {
            System.out.println(1);
        }
        else if ((Y==0) && (X!=0)) {
            System.out.println(2);
        }
        else if ((Y!=0) && (X!=0)) {
            System.out.println(3);
        }

    }

}
