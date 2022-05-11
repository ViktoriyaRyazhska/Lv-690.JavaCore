package practicArrays;

public class main {
    public static void main(String[] args) {
        maxNum();
        positiveNumSum();
        amountNegativeNum();

    }

    public static void maxNum() {
        int num[] = {3, 4, 8, 12, -3, 4, -8, 9, 18, 16};
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            if (result < num[i]) {
                result = num[i];
            }
        }
        System.out.println("Max integer in arrays is " + result);
    }

    public static void positiveNumSum() {
        int num[] = {3, 4, 8, 12, -3, 4, -8, 9, 18, 16};
        int posNum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                posNum += num[i];
            }
        }
        System.out.println("Sum of positive number is " + posNum);
    }

    public static void amountNegativeNum() {
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
       System.out.println("Positive number amount :"+posResult+"\nNegative number amount :"+negResult);


    }
}
