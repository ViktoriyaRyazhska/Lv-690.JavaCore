import java.util.Scanner;

public class if22 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите координаты точки на плоскости:");
        System.out.print("X:");
        int X = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Y:");
        int Y = b.nextInt();

        if ((X>0) && (Y>0))  {
            System.out.println("Первая четверть");
        }
        else if ((X<0) && (Y>0))  {
            System.out.println("Вторая четверть");
        }
        else if ((X<0) && (Y<0)) {
            System.out.println("Третья четверть");
        }
        else if ((X>0) && (Y<0)) {
            System.out.println("Чевертая четверть");
        }

    }
}
