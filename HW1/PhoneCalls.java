import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PhoneCalls {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("\nEnter the cost of the call for Germany");
        double price1 = scan.nextDouble();
        System.out.println("Enter the cost of the call for England");
        double price2 = scan.nextDouble();
        System.out.println("Enter the cost of the call for France");
        double price3 = scan.nextDouble();

        System.out.println("\n----------\n");
        System.out.println("How long was the call to Germany");
        double minute1 = scan.nextDouble();
        System.out.println("How long was the call to England");
        double minute2 = scan.nextDouble();
        System.out.println("How long was the call to France");
        double minute3 = scan.nextDouble();
        System.out.println("\n----------\n");

        double sum1 = Multiplication(price1,minute1);
        double sum2 = Multiplication(price2,minute2);
        double sum3 = Multiplication(price3,minute3);
        double totalSumCall = TotalSum(sum1,sum2,sum3);

        System.out.println("Price for a call to Germany : " + sum1);
        System.out.println("Price for a call to England : " + sum2);
        System.out.println("Price for a call to France : " + sum3);
        System.out.println("Total price of all call is : " + totalSumCall);

    }
    private static double Multiplication(double num1,double num2){
        return num1 * num2;
    }
    private static double TotalSum(double num1,double num2,double num3)
    {
        return num1 + num2 + num3;
    }

}
