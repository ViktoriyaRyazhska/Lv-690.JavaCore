package Team1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {

    private static String units[]= {"zero", "One", "Two", "Three", "Four", "Five","Six", "seven", "Eight", "Nine"};

    private static String teens[]={"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    private static String[] tens = {"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static String[] illions = {"", " Thousand " , " Million " , " Billion ", " Trillion ", " Zillion "};
    /**
     * @param args
     */
    public static void main(String[] args) {

        execute();

    }

    public static void execute(){

        System.out.println("Enter number from 1 to 1000 000.");

        Scanner sc = new Scanner(System.in);
        try {
            handlerLargeNumber(sc.nextLong());
        } catch(InputMismatchException ex) {
            System.out.println("You have entered invalid number.");
        }
    }

    private static void handlerLargeNumber(long largeNumber) {

        int numberTriplets[][] = new int[5][1];
        int count = -1;
        boolean negativeFlag = false;
        if (largeNumber == 0l) {
            System.out.println("You entered: Zero");
        } if (largeNumber < 0l) {
            negativeFlag = true;
            largeNumber*=-1;
        }
        for(count = 0 ; ; count++) {
            numberTriplets[count][0] = (int)(largeNumber % 1000L);
            if (largeNumber / 1000l == 0) {
                break;
            } else {
                largeNumber/=1000l;
            }
            if (count == illions.length) {
                System.out.println("Out of range.");
                System.exit(1);
            }
        }
        StringBuilder convertedWord = new StringBuilder();
        StringBuilder tripletWord = new StringBuilder();

        for (int i =0 ;i<=count ;i++) {
            tripletWord = handleTriplet(numberTriplets[i][0]);
            if (tripletWord.length() !=0) {
                convertedWord.insert(0, tripletWord.append(illions[i]));
            }
        }

        System.out.println("You entered: " + (negativeFlag==true?"Minus ":"") + convertedWord);
    }

    /**
     * Converts 3 digit number to word.
     * @param triplet
     * @return
     */
    private static StringBuilder handleTriplet(int triplet) {
        StringBuilder tripletWord = new StringBuilder();
        if (triplet != 0) {

            if(triplet/100 != 0) {
                tripletWord.append(units[triplet/100]).append(" Hundred");
            }
            int tempTens = (triplet%100)/10;
            if (tempTens !=0 && tempTens !=1) {
                tripletWord.append(" " + tens[tempTens]);
            } else if (tempTens == 1) {
                tripletWord.append(" " + teens[triplet%100 - 10]);
                return tripletWord;
            }

            if (triplet%10 != 0) {
                tripletWord.append(" "+ units[triplet%10]);
            }

        }
        return tripletWord;
    }
}