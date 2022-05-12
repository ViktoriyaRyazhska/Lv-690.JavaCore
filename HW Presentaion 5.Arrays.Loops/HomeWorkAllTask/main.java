//1     Ask user to enter the number of month.
//      Read the value and write the amount of days in this month (create array with amount days of each month).
// 2    Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
// 3    Enter 5 integer numbers. Find
//           position of second positive number;
//           minimum and its position in the array.
//        Organize entering integers until the first negative number.
//        Count the product of all entered even numbers.
// 5*.  Add Unit Tests to each task, publish code on GitHub


package HomeWorkAllTask;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        amountOfDays();
        tenIntegers();
        position();
        brakeIfMinus();
    }

    public static int amountOfDays() {
        int[] daysOfMonth = {0,31, 28, 31, 31, 30, 31, 31, 30, 31, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month:::");
        int numberOfMonth = sc.nextInt();
        boolean number = false;
        for (int i = 1; i < daysOfMonth.length; i++) {
            if (numberOfMonth == i) {
                System.out.println(daysOfMonth[i]);
                number = true;
            }
        }
        if (number == false) {
            System.out.println("You enter wrong number of month");
        }
        return daysOfMonth.length;
    }

    public static int tenIntegers() {
        int sum1 = 0;
        int sum2 = 1;
        boolean count = false;
        System.out.println("Enter first five numbers:::");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            sum1 += number;
            if (number < 0) {
                count = true;
                System.out.println("Not this variant. Calculate product last five numbers");
                break;
            }
        }
        if (count == false) {
            System.out.println("The sum1 of five positive numbers ::::  " + sum1);
        }

        if (count == true) {
            System.out.println("Enter again five numbers. Calculate product last five numbers.");
            for (int i = 0; i < 5; i++) {
                int number = sc.nextInt();
                sum2 *= number;
            }
            System.out.println("The sum2(product) of last five  numbers ::::  " + sum2);
        }
        return sum1;
    }

    public static int position() {
        int[] arrays = {1, 2, 3, 4, 5};
        int secondPosition = 0;
        int position = 0;
        int minNumber = arrays[0];
        int minPosition = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (i == 2) {
                secondPosition = arrays[i];
                position = i;
            }
            if (arrays[i] < minNumber) {
                minNumber = arrays[i];
                minPosition = i;
            }
        }
        System.out.println("Second positive number::: " + secondPosition + " his position::: " + position);
        System.out.println("Min number of arrays ::: " + minNumber + " his position::: " + minPosition);
        return secondPosition;
    }

    public static int brakeIfMinus() {
        int productSum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers and brake if a minus number:::   ");
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (number < 0) {
                System.out.println("There is a minus number");
                break;
            }
            if (number % 2 == 0) {
                productSum *= number;
            }
        }
        System.out.println("Count the product of all entered even numbers::: " + productSum);
        return productSum;
    }
}

