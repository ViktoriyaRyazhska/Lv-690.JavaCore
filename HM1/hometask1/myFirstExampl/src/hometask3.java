import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" enter price per minute for each country ");
        System.out.println(" C1 is");
        double c1= in.nextDouble();
        System.out.println(" C2 is");
        double c2= in.nextDouble();
        System.out.println(" C3 is");
        double c3 = in.nextDouble();

        System.out.println("duration of talk");
        System.out.println("duration of first talk is ");
        double t1 = in.nextDouble();
        System.out.println("duration of second talk is ");
        double t2 = in.nextDouble();
        System.out.println("duration of third talk is ");
        double t3 = in.nextDouble();

        double  con1 = c1 * t1;
        double  con2 = c2 * t2;
        double  con3 = c3 * t3;
        double all = con1 + con2+ con3;
        System.out.println("first call cost : " + con1);
        System.out.println("second call cost : " + con2);
        System.out.println("third call cost : " + con3);
        System.out.println(" total price is : " + all);


    }
}
