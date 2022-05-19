package HW1;

import java.util.Scanner;

public class PhoneCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the standart units per minute for first country:");
        float c1 = sc.nextFloat();
        System.out.print("Enter the standart units per minute for second country:");
        float c2 = sc.nextFloat();
        System.out.print("Enter the standart units per minute for third country:");
        float c3 = sc.nextFloat();
        System.out.print("Enter the first call duration:");
        float t1 = sc.nextFloat();
        System.out.print("Enter the second call duration:");
        float t2 = sc.nextFloat();
        System.out.print("Enter the third call duration:");
        float t3 = sc.nextFloat();

        float call1 = c1 * t1;
        float call2 = c2 * t2;
        float call3 = c3 * t3;
        float sum = call1 + call2 + call3;
        System.out.println("First call costs: " + call1);
        System.out.println("Second call costs: " + call2);
        System.out.println("Third call costs: " + call3);
        System.out.println("All talk together: " + sum);
    }
}
