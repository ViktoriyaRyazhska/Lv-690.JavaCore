import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {
        float[]a = new float [10];
        Scanner in = new Scanner(System.in);

        float Sum = 0;
        int i =0;

        for (float element:a) {
            System.out.print("Введите" +(i+1) + "й элемент массива");
            a [i] = in.nextInt();

            Sum = Sum+a[i];
            i++;
            }
        System.out.println(Sum);

    }

}
