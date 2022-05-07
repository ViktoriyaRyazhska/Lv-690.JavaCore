package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonFour {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fn1 = printWithInput("Input  first :_",br);
        String fn2 = printWithInput("Input  second :_",br);
        String fn3 = printWithInput("Input  third :_",br);
        int val1 = Integer.parseInt(fn1);
        int val2 = Integer.parseInt(fn2);
        int val3 = Integer.parseInt(fn3);

        int oddQuantity=0;

        LessonFour lf = new LessonFour();

        int[] arr = {val1, val2, val3};

        for (int i = 0; i <= 2; i++) {
            if (lf.compareVal(arr[i])==true) {
                oddQuantity++;
            }
        }

        System.out.println("Odd from them:" + oddQuantity);

    }
    public boolean compareVal(int val){

        if (val % 2 != 0) {
            return  true;}
        else
            return false;
    }
    public static String printWithInput(String txt, BufferedReader br)throws IOException {
        System.out.println(txt);
        return br.readLine();

}
}