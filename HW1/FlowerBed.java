import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius of the flower bed :");
        double radius = scan.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter of the flower bed is " + perimeter);
        System.out.println("Area of the flower bed is " + area);



    }
}
