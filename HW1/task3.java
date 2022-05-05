package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write speak times:");
        System.out.print("t1 = ");
        int t1 = Integer.parseInt(br.readLine());
        System.out.print("t2 = ");
        int t2 = Integer.parseInt(br.readLine());
        System.out.print("t3 = ");
        int t3 = Integer.parseInt(br.readLine());

        System.out.println("Write price per minutes:");
        System.out.print("p1 = ");
        int p1 = Integer.parseInt(br.readLine());
        System.out.print("p2 = ");
        int p2 = Integer.parseInt(br.readLine());
        System.out.print("p3 = ");
        int p3 = Integer.parseInt(br.readLine());

        System.out.println("Count for speak will be:");
        System.out.println("Count1 = " +  t1 * p1);
        System.out.println("Count2 = " +  t2 * p2);
        System.out.println("Count3 = " +  t3 * p3);

        System.out.println("All Count will be: " + ((t1*p1 + t2*p2 + t3*p3)));





    }
}
