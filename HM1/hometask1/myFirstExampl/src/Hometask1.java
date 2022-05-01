import java.util.Scanner;

public class Hometask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        final double PI = 3.14;
        double perimetr = 2 * PI * r;
        double area = PI * r * r;

        System.out.println("perimetr of flower bed is " + perimetr);
        System.out.println("area of flower bed is " + area);

    }

}
