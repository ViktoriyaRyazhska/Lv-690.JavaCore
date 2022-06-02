//Write a method readNumber(int start, int end),
// that read from console integer number and return it, if it is in the range [start...end].
//        If an invalid number or non-number text is read, the method should throw an exception.
//        Using this method write a method main(), that has to enter 10 numbers:
//        a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100


        package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        try {
            for(int i=0;i<10;i++) {
                readNumber(1, 20);
            }
        } catch (RangeException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }

    }
    public static int readNumber(int start,int end) throws RangeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start and End of range ---"+start+" "+end);
            int number= Integer.parseInt(sc.nextLine());
            if(number<=start||number>=end){
                throw new RangeException("The number is not in our range");
            }
                return number;



    }
}
