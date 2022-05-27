package HW5;
//Create an array of ten integers. Display 
//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//       What values there are more: negative or positive?

public class Numbers {

    public static void main(String[] args) {
        maxNumber();
        sumPositiveNumbers();
        amountNegativeNumbers();
    }

    public static void maxNumber() {
        int num[] = {3, 4, 8, 12, -3, 4, -8, 9, 18, 16};
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            if (result < num[i]) {
                result = num[i];
            }
        }
        System.out.println("Max integer in arrays is: " + result);
    }

    public static void sumPositiveNumbers() {
        int num[] = {3, 4, 8, 12, -3, 4, -8, 9, 18, 16};
        int posNum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                posNum += num[i];
            }
        }
        System.out.println("Sum of positive number is: " + posNum);
    }

    public static void amountNegativeNumbers() {
        int num[] = {3, 4, 8, 12, -3, 4, -8, 9, -18, 16};
        int negResult = 0;
        int posResult = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                negResult++;
            }
            else
            {
                posResult++;
            }
        }
       System.out.println("Amount of Positive numbers: "+posResult+"\nAmount of Negative numbers: "+negResult);


    }
}