package tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        final double PI= 3.14;
        double r;
        System.out.println("Введіть радіус кола(r)");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        r = Integer.parseInt(br.readLine());
        System.out.println("Ви ввели r= "+r);
        //периметр круга -l
        double l=2*PI*r;
        System.out.println("Периметр круга "+l);
        //площа круга - S
        double s=PI*Math.pow(r,2);
        System.out.println("Площа круга "+s);

    }
}