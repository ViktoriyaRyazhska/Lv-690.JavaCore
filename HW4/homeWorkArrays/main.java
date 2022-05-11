package homeWorkArrays;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        month();
        firstFive();
        position();
        brakeMinus();

    }

    public static int month() {
        int[] month = {0, 30, 31, 30, 29, 30, 28, 31, 30, 30, 29, 31, 29};

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        boolean isNull = false;

       System.out.println("Enter number of the month");
        int num = Integer.parseInt(sc.next());

        for (int i = 1; i < month.length; i++) {
            if (num == i) {
                temp = month[i];
            } else if (num <= 0 || num >= 13) {
                isNull = true;
            }
        }
        if (isNull == false) {
            System.out.println("Amount days in this month is " + temp);
        } else if (isNull == true) {
            System.out.println("Wrong input");
        }

        return month.length;

    }

    public static int firstFive() {

        boolean ifCont = false;
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 1;

        System.out.println("Enter number :");
        for (int i = 0; i < 5; i++) {

            int num = Integer.parseInt(sc.next());
            sum1 += num;
            if (num <= 0) {
                System.out.println("Chain brake");
                ifCont = true;
                break;
            }
        }
        if (ifCont == true) {
            for (int i = 0; i < 5; i++) {
                int num = Integer.parseInt(sc.next());
                sum2 *= num;
            }
            System.out.println("Product of last five number " + sum2);
        }
        if (ifCont == false) {
            System.out.println("Sum of first five number " + sum1);
        }

        return sum1;

    }

    public static int position() {
        int[] num = {3, 4, 6, 7, 8};
        int numResult = 0;
        int numIndex = 0;
        int minNum = num[0];
        int minIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (i == 2) {
                numResult = num[i];
                numIndex = i;
            }
            if (num[i] < minNum) {
                minNum = num[i];
                minIndex = i;
            }

        }
        System.out.println("Number " + numResult + " in " + numIndex + " position");
        System.out.println("Min number " + minNum + " in " + minIndex + " position");

        return numResult;
    }

    public static int brakeMinus() {
        Scanner sc = new Scanner(System.in);
        int sum = 1;

        System.out.println("Enter number :");
        for (int i = 0; i < 5; i++) {

            int num = Integer.parseInt(sc.next());

            if (num <= 0) {
                System.out.println("Chain brake");
                break;
            }
            if (num % 2 == 0) {
                sum *= num;
            }
        }
        System.out.println("Product of last five number " + sum);
        return sum;
    }
}
