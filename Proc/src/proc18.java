import java.util.Scanner;

public class proc18 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите радиус:");
            a[i] = n.nextInt();
        }

        //Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное).
// С помощью этой функции найти площади трех кругов с данными радиусами. Площадь круга радиуса R вычисляется по
// формуле S = π·R2
//. В качестве значения π использовать 3.14.
double pi = 3.14;
        for (int i = 0; i < 3; i++) {
            double Circ = (pi * a[i] * a[i]);
            System.out.println(Circ);
        }
    }
}