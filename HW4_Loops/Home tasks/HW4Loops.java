package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4Loops {

    public static void main(String[] args) throws Exception {

        //1
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = printWithInput("Enter the number of month:_",br);
        System.out.println("Amount of days in this month "+months[number-1]);

        //2
        int[] arr;
        arr = new int[10];
        for (int i=0;i<arr.length;i++){
           arr[i] = printWithInput("Enter the integer number "+(i+1),br);
        }
        doSomething10int(arr);

        //3
        int[] arr5;
        arr5 = new int[5];
        for (int i=0;i<arr5.length;i++){
           arr5[i] = printWithInput("Enter the integer number "+(i+1),br);
        }
        doSomething5int(arr5);

        //4 entering integers until the first negative number
        int posit;
        int i=1;
        do {
            posit = printWithInput("Enter the integer number ",br);
            if (posit>0 && (posit % 2 == 0)){
                i *=posit;
            }
        } while (posit>0);
        System.out.println("product of all entered even numbers "+i);

    }

    public static void doSomething10int(int[] arr){
        int sum = 0;
        int product = 1;
        boolean firstCond = true;

        for (int i=0;i<5;i++){
            if (arr[i]<=0){
                firstCond = false;
                break;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (firstCond == true && i < 5){
                sum+=arr[i];
            }
            if (firstCond == false && i>=5){
                product *=arr[i];
            }
        }
        if (firstCond == true){
            System.out.println("sum of first fifth elements "+sum);
        } else {
            System.out.println("product of last fifth elements "+product);
        }
    }
    public static void doSomething5int(int[] arr){

        //position of second positive number
        int pos2 = 0;
        int ident = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                pos2=i+1;
                ident++;
            }
            if (ident==2){
                break;
            }
        }
        System.out.println("position of second positive number "+pos2);

        //minimum and its position in the array
        int min = arr[0];
        int posMin = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] < min){
                posMin=i+1;
                min = arr[i];
            }
        }
        System.out.println("minimum in the array "+ min +" and its position "+posMin);
    }
    public static int printWithInput(String txt, BufferedReader br)throws IOException {

        System.out.println(txt);
        String str = br.readLine();
        return Integer.parseInt(str);
    }
}
